/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;
import javax.swing.*;
import java.util.*;
import java.awt.*;

/**
 *
 * @author Kim
 */
public class CellRenderer extends JLabel implements ListCellRenderer {
  

  public CellRenderer() {
    setOpaque(true);
    setIconTextGap(12);
  }

  public Component getListCellRendererComponent(JList list, Object value,
     int index, boolean isSelected, boolean cellHasFocus) {
      
    productCell prodcell = (productCell) value;
    setText(prodcell.getName() + prodcell.getAmount() + prodcell.getPrice());
    setIcon(prodcell.getImage());
   
    
  
  return this;
    }
}
