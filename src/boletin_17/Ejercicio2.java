
package boletin_17;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;


public class Ejercicio2 {
  Alumno alumnos [] = new Alumno[2];
   int notas[]= new int[2];
  
   
   
   
   public String pedirNombre(){
  return JOptionPane.showInputDialog("Introduce el nombre");
}
public int pedirNota(){
    
  return Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota"));    

    } 
    
    public void cargarArray(){
      
        Random rm = new Random();
        for(int i=0;i<notas.length;i++){
        notas[i] = rm.nextInt(10);
        System.out.println(notas[i]);
        }
    }
    public void cargarArray2(){
        
        for(int i=0;i<alumnos.length;i++){
            
            alumnos[i] = new Alumno(pedirNota(),pedirNombre());
        }
        
    }
      public void aprobadosSuspensos(){
          
          for(int i=0;i<notas.length;i++){
              
              if(notas[i]>5){
                  System.out.println(notas[i]+"----->"+ " Aprobado ");
              }else
                  System.out.println(notas[i]+"----->"+ " Suspenso ");
              
          }
          
      }

public void visualizarMedia(){
      int media=0;
    for(int i=0;i<notas.length;i++){
      media = media+notas[i];
  
    } 
    System.out.println(media/notas.length);
    }

public void notaMayor(){
   int notaMayor = notas[0];
   
    for(int i=0;i<notas.length;i++){
    if(notas[i]>notaMayor){
        notaMayor =notas[i];
       
    }
  System.out.println("la nota mayor es "+notaMayor);
    
    }
   
}
public void visualizarAlumnos(){
    for(Alumno alu:alumnos){
        System.out.println(Arrays.toString(alumnos));
    }
}

}     
            

