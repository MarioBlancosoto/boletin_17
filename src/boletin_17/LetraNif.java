
package boletin_17;

import javax.swing.JOptionPane;


public class LetraNif {
     String letra[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
   
    public  int calculaResto(){
        
     int dni = (Integer.parseInt(JOptionPane.showInputDialog("Introduce  numero DNI"))%23);
        
        return dni;
    }
    
   public void cargarArray(){
       for(int i=0;i<letra.length;i++){
       
      
       }
       
   }
}
