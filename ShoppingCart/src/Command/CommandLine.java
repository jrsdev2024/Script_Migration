/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Product.Product;

/**
 *
 * @author Ricardo
 */
public class CommandLine {
    
    private Product oneProduct;
    private int quantity;

    public CommandLine(Product oneProduct, int quantity) {
        this.oneProduct = oneProduct;
        this.quantity = quantity;
    }

    public Product getOneProduct() {
        return oneProduct;
    }

    public void setOneProduct(Product oneProduct) {
        this.oneProduct = oneProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public CommandLine addACommandLine(Product aProduct){
        
        
        return new CommandLine(aProduct,1);
        
        
    }
    
    
    
    
    
}
