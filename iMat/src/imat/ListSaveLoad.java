/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.Product;

/**
 *
 * @author victorsandell
 */
public class ListSaveLoad {
    
    private static ListSaveLoad instance = null;
    
    protected ListSaveLoad(){
        //Singleton...
    }
    
    public static ListSaveLoad getInstance(){
        if(instance == null){
            instance = new ListSaveLoad();
            File f = new File("savefile.txt");
        }
            return instance;           
    }

    public void saveList(List<ShoppingItemList> pl){
        
        if(pl.size() == 0 || pl == null){
            return;
        }
        List<ShoppingItemList> pList = pl;
        try{
            OutputStream buffer = new BufferedOutputStream
                    (new FileOutputStream("savefile.txt"));
            ObjectOutput output = new ObjectOutputStream(buffer);
          try{
              try{
                for(ShoppingItemList sil : pList){
                     output.writeObject(sil);
                     System.out.println("SAVED!");
                }
             }catch(EOFException e){}
             try{
                pList = loadList();
             }catch(Exception e){
                 ;
             }
             
             output.writeObject(pList);
             
          }finally{
            output.flush();
            output.close();
          }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public List<ShoppingItemList> loadList(){
        List<ShoppingItemList> shoppingItemList = new ArrayList<ShoppingItemList>();
        
        try{
            InputStream file = new FileInputStream("savefile.txt");
            InputStream buffer = new BufferedInputStream(file);
            ObjectInput input = new ObjectInputStream (buffer);
                
            try{
                int i = 0;
                while(true){
                    try{
                        i++;
                        ShoppingItemList sil = (ShoppingItemList)input.readObject();
                        shoppingItemList.add(sil);
                        
                    }catch(EOFException e){
                        break;
                    }catch(StreamCorruptedException e){
                        break;
                    }catch(ClassCastException e){
                        break;
                    }
                }
                    
                //}
            }catch(IOException e){
                e.printStackTrace();
            }finally{
                input.close();
            }
        }catch(IOException e){
            ;
        }catch(ClassNotFoundException e){
            
        }
        return shoppingItemList;
    }
    
    
}