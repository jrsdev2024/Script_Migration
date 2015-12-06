/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promotion;

import Cart.Cart;
import Command.Command;
import Product.Product;

/**
 *
 * @author Ricardo
 */
public class Promotion {
    
    public int idPromotion;
    
    public boolean applyPromotion(int idPromotions, Cart aCart){
        
        
        
        
        return false;
    }
    
    
    public void promoBIenEtre(Cart aCart){
        
        Command oneCommand =  aCart.getOneCommand();
        
        for(int i = 0; i < oneCommand.getCommandLine().size(); i++){
            Product aProduct = oneCommand.getCommandLine().get(i).getOneProduct();
            if(aProduct.getCategory().equals("85")){
                
                
            }
            
        }
    }
    
}
