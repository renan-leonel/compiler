package main;

import antlr.FCpBaseVisitor;
import antlr.FCpParser;

import java.util.ArrayList;

public class CppGenerator extends FCpBaseVisitor<Void> {
    StringBuilder outputStr;
    SymbolTable table;

    public CppGenerator(){
        this.table = new SymbolTable();
        outputStr = new StringBuilder();
    }

    @Override
    public Void visitStart(FCpParser.StartContext ctx) {
        outputStr.append("#include <iostream>\nint main() {\n");
        ctx.cmdList().forEach(cmd -> visitCmdList(cmd));
        outputStr.append("return 0;\n}");
        return null;
    }

    @Override
    public Void visitDeclaration(FCpParser.DeclarationContext ctx) {
       String varName = ctx.IDENTIFIER().getText();
       String typeName;
       if(ctx.INT_TYPE()!=null){
           typeName = "int";
           if(ctx.ASSIGNMENT_OP()!=null){
               outputStr.append(typeName + " " + varName + " " + " = ");
               visitMathExp(ctx.mathExp());
               outputStr.append(";\n");
           }else{
            outputStr.append(typeName + " " + varName + ";\n");
           }
       }else if(ctx.FLOAT_TYPE()!=null){
           typeName = "float";
           if(ctx.ASSIGNMENT_OP()!=null){
               outputStr.append(typeName + " " + varName + " " + " = ");
               visitMathExp(ctx.mathExp());
               outputStr.append(";\n");
           }else{
               outputStr.append(typeName + " " + varName + ";\n");
           }

       }else if(ctx.BOOLEAN_TYPE()!=null){
           typeName = "bool";
           if(ctx.ASSIGNMENT_OP()!=null){
               outputStr.append(typeName + " " + varName + " " + " = ");
               visitRelExp(ctx.relExp());
               outputStr.append(";\n");
           }else{
               outputStr.append(typeName + " " + varName + ";\n");
           }
       }else{
           typeName = "std::string";
           if(ctx.ASSIGNMENT_OP()!=null){
               outputStr.append(typeName + " " + varName + " " + " = " + ctx.STRING_VALUES() +";");
           }else{
               outputStr.append(typeName + " " + varName + ";\n");
           }
       }


        return null;
    }

    @Override
    public Void visitCmdList(FCpParser.CmdListContext ctx) {
        if(ctx.declaration() != null){
            visitDeclaration(ctx.declaration());
        }
        else if(ctx.assignment() != null){
            visitAssignment(ctx.assignment());
        }
        else{
            visitExeCmd(ctx.exeCmd());
        }

        return null;
    }

    @Override
    public Void visitMathExp(FCpParser.MathExpContext ctx) {
        /*visitMathTerm(ctx.mathTerm(0));

        if(ctx.mathTerm().size() == 1){
            return null;
        }

        System.out.println(ctx.getText());

        for(int i = 0; i < ctx.mathTerm().size(); i++){

            if(ctx.MULT_OP() != null || ctx.ADD_OP() != null){
                if(ctx.ADD_OP() != null){
                    outputStr.append(" " + ctx.ADD_OP(0).getText() + " ");
                }
                else{
                    outputStr.append(" " + ctx.MULT_OP(0).getText() + " ");
                }
            }

            visitMathTerm(ctx.mathTerm(i+1));
        }*/

        outputStr.append(ctx.getText());

        return null;
    }

    @Override
    public Void visitMathTerm(FCpParser.MathTermContext ctx) {
        if(ctx.INT_VALUES() != null){
            outputStr.append(ctx.INT_VALUES().getText());
        }
        else if(ctx.FLOAT_VALUES() != null){
            outputStr.append(ctx.FLOAT_VALUES().getText());
        } else if (ctx.IDENTIFIER() != null) {
            outputStr.append(ctx.IDENTIFIER().getText());
        }
        else{
            outputStr.append("(");
            visitMathExp(ctx.mathExp());
            outputStr.append(")");
        }

        return null;
    }

    @Override
    public Void visitRelExp(FCpParser.RelExpContext ctx) {
/*      ArrayList<String> termoList = new ArrayList<String>();
        ArrayList<String> opRelList = new ArrayList<String>();
        ArrayList<String> opLogList = new ArrayList<String>();

        ctx.relTerm().forEach(relT -> termoList.add(relT.getText()));
        ctx.REL_OP().forEach(relT -> opRelList.add(relT.getText()));
        ctx.EQU_OP().forEach(relT -> opRelList.add(relT.getText()));
        ctx.LOGICAL_OP().forEach(relT -> opLogList.add(relT.getText()));

        int idxTermoList = 0, idxOpRelList = 0, idxOpLogList = 0;

        String result = "";

        while(true){
            if(termoList.size() == 1){
                result += termoList.get(idxTermoList) + " ";

                break;
            }

            result += termoList.get(idxTermoList) + " ";
            result += opRelList.get(idxOpRelList) + " ";
            result += termoList.get(idxTermoList+1) + " ";

            if(opLogList.isEmpty()){
                break;
            }

            if(idxOpLogList < opLogList.size()){
                result += opLogList.get(idxOpLogList) + " ";
            }

            idxTermoList+=2;
            idxOpLogList+=1;
            idxOpRelList+=1;

            if(idxTermoList == termoList.size()){
                break;
            }
        }

        outputStr.append(result);*/
        String exp = new String();
        exp = ctx.getText().replace("TRUE", "true");
        exp = exp.replace("FALSE", "false");
        outputStr.append(exp);
        return null;
    }

    @Override
    public Void visitRelTerm(FCpParser.RelTermContext ctx) {
        if(ctx.BOOLEAN_VALUES() != null){
            outputStr.append(ctx.BOOLEAN_VALUES().getText().toLowerCase());
        }

        else if(ctx.mathExp() != null){
            visitMathExp(ctx.mathExp());
        }

        else{
            outputStr.append("(");
            visitRelExp(ctx.relExp());
            outputStr.append(")");
        }

        return null;
    }

    @Override
    public Void visitExeCmd(FCpParser.ExeCmdContext ctx) {

        if(ctx.ifCmd() != null){
            outputStr.append("if(");
            visitRelExp(ctx.ifCmd().relExp());
            outputStr.append(")");
            outputStr.append("{\n");
            ctx.ifCmd().cmdList().forEach(cmdL -> visitCmdList(cmdL));
            outputStr.append("}\n");

            if(ctx.ifCmd().elseCmd() != null){
                outputStr.append("else{\n");
                ctx.ifCmd().elseCmd().cmdList().forEach(cmdL -> visitCmdList(cmdL));
                outputStr.append("}\n");
            }
        }

        if(ctx.whileCmd() != null){
            outputStr.append("while(");
            visitRelExp(ctx.whileCmd().relExp());
            outputStr.append(")");
            outputStr.append("{\n");

            ctx.whileCmd().cmdList().forEach(cmdL ->visitCmdList(cmdL));
            outputStr.append("}\n");
        }

        if(ctx.inputCmd() != null){
            outputStr.append("std::cin>>" + ctx.inputCmd().IDENTIFIER() + ";\n");
        }

        if(ctx.outputCmd() != null){
            if(ctx.outputCmd().IDENTIFIER() != null){
                outputStr.append("std::cout<<" + ctx.outputCmd().IDENTIFIER() + ";\n");
            }else{
                outputStr.append("std::cout<<" + ctx.outputCmd().STRING_VALUES() + ";\n");
            }

        }

        return null;
    }

    @Override
    public Void visitAssignment(FCpParser.AssignmentContext ctx) {
        outputStr.append(ctx.IDENTIFIER().getText() + " = ");

        if(ctx.mathExp() != null){
            System.out.println(ctx.mathExp().getText());
            visitMathExp(ctx.mathExp());
        }
        else if(ctx.relExp() != null){
            visitRelExp(ctx.relExp());
            System.out.println(ctx.relExp().getText());
        }
        else{

            outputStr.append(ctx.STRING_VALUES().getText());
        }

        outputStr.append(";\n");
        return null;
    }
}
