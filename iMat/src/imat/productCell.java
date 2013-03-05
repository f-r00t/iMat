package imat;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kim
 */

import javax.swing.ImageIcon;

public class productCell {
    private  String name;
    private double price;
    private double amount;
    private ImageIcon image;
    
    // Getters
    public String getName(){
        return name;
        
    }
    
    public double getPrice(){
        return price;
        
    }
    public double getAmount(){
        return amount;
        
    }
    
    public ImageIcon getImage(){
        return image;
        
    }
    
    public productCell(String name, double price, double amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
       // this.image = image;
        
    }
            
}
