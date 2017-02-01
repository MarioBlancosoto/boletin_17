
package boletin_17;

import javax.swing.JOptionPane;


public class LetraNif{
   
     char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
   
    
   public void metodoNif(){
       
       int dni = (Integer.parseInt(JOptionPane.showInputDialog("Introduce  numero DNI")));
       
       int resultado = dni%23;
      
       System.out.println(resultado+ "---> "+letra[resultado]);
       
   }
}
