package main;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    public enum FCpType{
        INT, FLOAT, STRING, INVALID, BOOL
    }

    class SymbolTableShape{
        String varName;
        FCpType varType;

        private SymbolTableShape(String varName, FCpType varType){
            this.varName = varName;
            this.varType = varType;

        }
    }

    private Map<String, SymbolTableShape> table;

    public void printTable(){
        for (String key : table.keySet()) {
            SymbolTableShape value = table.get(key);
            System.out.println(key + " : " + value.varType);
        }
    }
    public SymbolTable(){
        this.table = new HashMap<>();
    }

    public void addTable(String varName , FCpType varType){
        this.table.put(varName, new SymbolTableShape(varName, varType));
    }

    public boolean find(String varName){
        return this.table.containsKey(varName);
    }

    public FCpType verify(String varName){
        return this.table.get(varName).varType;
    }

}
