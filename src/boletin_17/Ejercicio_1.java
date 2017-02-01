
package boletin_17;

import java.util.Random;


public class Ejercicio_1 {
    
    int numeros[]= new int[6];
    
    
    
    public void cargarArrayNumeros(){
        Random rm = new Random();
       
        for(int i=0;i<numeros.length;i++){
          
        numeros[i] = rm.nextInt(50);
        System.out.println(numeros[i]);
    }
    }
      public void visualizarAlreves(){
          
       for(int i= numeros.length-1;i>=0;i--){
           System.out.println(numeros[i]);
       }
          
      }

   
     
}
