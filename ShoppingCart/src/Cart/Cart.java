/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import Command.Command;
import Product.Product;

/**
 *
 * @author Ricardo
 */
public class Cart {
    
    private Command oneCommand;

    public Cart(Command oneCommand) {
        this.oneCommand = oneCommand;
    }

    public Command getOneCommand() {
        return oneCommand;
    }

    public void setOneCommand(Command oneCommand) {
        this.oneCommand = oneCommand;
    }
    
    public boolean addProduct(Product aProduct){
        
        oneCommand.addProduct(aProduct);
        
        return false;
    }
    
    public boolean removeProduct(Product aProduct ){
        
        oneCommand.removeProduct(aProduct);
        
        return false;
    }
    
}
