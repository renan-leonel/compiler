package main;


import antlr.FCpBaseVisitor;
import antlr.FCpParser;

public class FCpSemantic extends FCpBaseVisitor<Void> {

    SymbolTable table;

    @Override
    public Void visitStart(FCpParser.StartContext ctx) {
        this.table = new SymbolTable();
        return super.visitStart(ctx);
    }

    @Override
    public Void visitDeclaration(FCpParser.DeclarationContext ctx) {

        String varName = ctx.IDENTIFIER().getText();
        SymbolTable.FCpType varType =  SymbolTable.FCpType.INVALID ;

        if(ctx.INT_TYPE() != null){
            varType = SymbolTable.FCpType.INT;
        }else if(ctx.FLOAT_TYPE() != null){
            varType = SymbolTable.FCpType.FLOAT;
        }else if(ctx.STRING_TYPE() != null){
            varType = SymbolTable.FCpType.STRING;
        }else{
            varType = SymbolTable.FCpType.BOOL;
        }

        if(ctx.mathExp()!=null){

            SymbolTable.FCpType mathType = SemanticUtils.mathTypeVerify(this.table, ctx.mathExp());

            if(varType != mathType) {
                SemanticUtils.addSemantiErrors(ctx.IDENTIFIER().getSymbol(), "Variable " + varName + " received invalid expression");
            }
        }
        if(ctx.relExp()!=null){
            if(varType != SemanticUtils.relTypeVerify(this.table, ctx.relExp())){
                SemanticUtils.addSemantiErrors(ctx.IDENTIFIER().getSymbol(), "Variable " + varName + " received invalid expression");
            }
        }

        if(this.table.find(varName)){
            SemanticUtils.addSemantiErrors(ctx.IDENTIFIER().getSymbol(), "Variable " + varName + " already exists");
        }else{
            this.table.addTable(varName, varType);
        }
        return super.visitDeclaration(ctx);
    }

    @Override
    public Void visitAssignment(FCpParser.AssignmentContext ctx) {
        if(ctx.mathExp()!=null){
            SymbolTable.FCpType expType = SemanticUtils.mathTypeVerify(this.table, ctx.mathExp());
            if(expType != SymbolTable.FCpType.INVALID){
                String varName = ctx.IDENTIFIER().getText();
                if(!this.table.find(varName)){
                    SemanticUtils.addSemantiErrors(ctx.IDENTIFIER().getSymbol(), "Expression" + ctx.getText() +  " contains incompatible types");
                }
                else{
                    SymbolTable.FCpType varType  = this.table.verify(varName);
                    if(varType != expType){
                        SemanticUtils.addSemantiErrors(ctx.IDENTIFIER().getSymbol(), "Variable type " + varName
                                + " is not compatible with expression type");
                    }
                }
            }

        }
        //fazer para exp e para strings

        return super.visitAssignment(ctx);
    }

    @Override
    public Void visitExeCmd(FCpParser.ExeCmdContext ctx) {
        if(ctx.inputCmd()!=null){
            String varName = ctx.inputCmd().IDENTIFIER().getText();
            if(this.table.find(varName)){
                SymbolTable.FCpType inputType = this.table.verify(varName);
                /*if(!inputType.getClass().getSimpleName().equals(ctx.getChild(0).getClass().getSimpleName())){
                    SemanticUtils.addSemantiErrors(ctx.inputCmd().IDENTIFIER().getSymbol(),"The input must be of the same type as the variable " +varName + ".");
                }*/
            }else{
                SemanticUtils.addSemantiErrors(ctx.inputCmd().IDENTIFIER().getSymbol(), "Variable" + varName + "does not exists");
            }

        }

        if(ctx.outputCmd() != null){
            if(ctx.outputCmd().IDENTIFIER()!= null) {
                String varName = ctx.outputCmd().IDENTIFIER().getText();
                if (!this.table.find(varName)) {
                    SemanticUtils.addSemantiErrors(ctx.outputCmd().IDENTIFIER().getSymbol(), "Variable" + varName + "does not exists");
                }
            }

        }

        if(ctx.ifCmd() != null){

        }

        return super.visitExeCmd(ctx);
    }


    @Override
    public Void visitMathExp(FCpParser.MathExpContext ctx) {
        SemanticUtils.mathTypeVerify(this.table, ctx);
        return super.visitMathExp(ctx);
    }

    @Override
    public Void visitRelExp(FCpParser.RelExpContext ctx) {
        SemanticUtils.relTypeVerify(this.table, ctx);
        return super.visitRelExp(ctx);
    }


}
