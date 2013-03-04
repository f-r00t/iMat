/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author victorsandell
 */
public class ShoppingItemList implements Serializable{
    private List<ShoppingItem> shoppingList;
    private String name;
        
    public ShoppingItemList(){
        shoppingList = new ArrayList<ShoppingItem>();
    }
    
    public void addProduct(ShoppingItem p){
        shoppingList.add(p);
    }
    
    public int size(){
        return shoppingList.size();
    }
    
    public int getAmount(){
        return shoppingList.size();
    }
    
    public int getTotal(){
        int sum = 0;
        for(ShoppingItem si : shoppingList){
            sum += si.getTotal();
        }
        return sum;
    }
    
    public List<ShoppingItem> getProductList(){
        return shoppingList;
    }
    
    public void setFromList(List<ShoppingItem> p){
        shoppingList = p;
    }
    
    public ShoppingItem get(int i){
        return shoppingList.get(i);
    }
    
    public void add(ShoppingItem s){
        shoppingList.add(s);
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        String s = "";
        for(ShoppingItem p : shoppingList){
            s += p.toString();
            s += "\n";
        }
        return s;
    }
}
