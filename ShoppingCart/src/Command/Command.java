/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Product.Product;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class Command {
    
    private String id;
    private ArrayList<CommandLine> commandLine;

    public Command(String id, ArrayList<CommandLine> commandLine) {
        this.id = id;
        this.commandLine = commandLine;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<CommandLine> getCommandLine() {
        return commandLine;
    }

    public void setCommandLine(ArrayList<CommandLine> commandLine) {
        this.commandLine = commandLine;
    }
    
    
    public boolean addProduct(Product aProduct){
        boolean isProductFind = false;
        for(int i = 0; i < commandLine.size(); i++ ){
            if(commandLine.get(i).getOneProduct().equals(aProduct)){
                int quantity = commandLine.get(i).getQuantity();
                commandLine.get(i).setQuantity(quantity++);
                isProductFind = true;
            }
        }
        
        if(!isProductFind){
            CommandLine oneCommandline = new CommandLine(aProduct,1);
            commandLine.add(oneCommandline);
            isProductFind = true;
        }
        return isProductFind;
    }
    
    
    public boolean removeProduct(Product aProduct){
        boolean isProductFind = false;
        
        for(int i = 0; i < commandLine.size(); i++){
            if(commandLine.get(i).getOneProduct().equals(aProduct)){
                commandLine.remove(i);
                isProductFind = true;
            }
        }
        
        
        return false;
    }
}
