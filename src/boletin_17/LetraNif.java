
package boletin_17;

import javax.swing.JOptionPane;


public class LetraNif {
     String letra[] = new String [23];
    public  int calculaResto(){
        
        return (Integer.parseInt(JOptionPane.showInputDialog("Introduce  numero DNI"))%23);
        
        
    }
    
   public void cargarArray(){
       for(int i=0;i<letra.length;i++){
       
       }
   }
}
