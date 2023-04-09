package main;

import antlr.FCpParser;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class SemanticUtils {
    public static List<String> semanticErrors = new ArrayList<>();

    public static void addSemantiErrors(Token tk, String errorMessage){
        String error = String.format("Error %d: %d - %s", tk.getLine(), tk.getCharPositionInLine(), errorMessage);
        semanticErrors.add(error);
    }

    public static SymbolTable.FCpType mathTypeVerify(SymbolTable table, FCpParser.MathExpContext ctx){
        SymbolTable.FCpType ret = null;
        for(var mathTerm: ctx.mathTerm() ){
            SymbolTable.FCpType termType = mathTypeVerify(table, mathTerm);
            if(ret == null || ret == SymbolTable.FCpType.INT || ret == SymbolTable.FCpType.FLOAT){
                ret = termType;
            }else if(ret != termType && termType !=  SymbolTable.FCpType.INVALID){
                addSemantiErrors(ctx.start, "Expression " + ctx.getText() +  " contains incompatible types");
                ret = SymbolTable.FCpType.INVALID;
            }
        }
        return ret;
    }

    public static SymbolTable.FCpType mathTypeVerify(SymbolTable table, FCpParser.MathTermContext ctx){
        if(ctx.INT_VALUES() != null){
            return  SymbolTable.FCpType.INT;
        }
        if(ctx.FLOAT_VALUES() != null){
            return  SymbolTable.FCpType.FLOAT;
        }
        if(ctx.mathExp() != null){
            return  mathTypeVerify(table, ctx.mathExp());
        }

        String varName = ctx.IDENTIFIER().getText();
        if(! table.find(varName)){
            addSemantiErrors(ctx.IDENTIFIER().getSymbol(), "Variable " + varName + " must be declared before use");
            return SymbolTable.FCpType.INVALID;
        }
         return table.verify(varName);
    }

    public static SymbolTable.FCpType relTypeVerify(SymbolTable table, FCpParser.RelExpContext ctx){
        SymbolTable.FCpType ret = null;
        for(var relTerm: ctx.relTerm() ){
            SymbolTable.FCpType termType = relTypeVerify(table, relTerm);
            if(ret == null || ret == SymbolTable.FCpType.INT || ret == SymbolTable.FCpType.FLOAT || ret == SymbolTable.FCpType.BOOL){
                ret = termType;
            }else if(ret != termType && termType !=  SymbolTable.FCpType.INVALID){
                addSemantiErrors(ctx.start, "Expression " + ctx.getText() +  " contains incompatible types");
                ret = SymbolTable.FCpType.INVALID;
            }
        }
        return ret;
    }

    public static SymbolTable.FCpType relTypeVerify(SymbolTable table, FCpParser.RelTermContext ctx) {
        if (ctx.BOOLEAN_VALUES() != null) {
            return SymbolTable.FCpType.BOOL;
        }
        if (ctx.mathExp() != null) {
            return mathTypeVerify(table, ctx.mathExp());
        }
        if (ctx.relExp() != null) {
            return relTypeVerify(table, ctx.relExp());
        }
        return null;
    }



}
