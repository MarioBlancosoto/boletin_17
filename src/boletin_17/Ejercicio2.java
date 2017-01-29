
package boletin_17;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;


public class Ejercicio2 {
  Alumno alumnos [] = new Alumno[4];
   int notas[]= new int[4];
  Alumno [] alu ={ new Alumno(8,"Jorge"),new  Alumno(5,"Jesus")};
   
   
   
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
          int aprobados=0;
          int suspensos =0;
          for(int i=0;i<notas.length;i++){
              
              if(notas[i]>5){
                  aprobados++;
                  System.out.println(notas[i]+"----->"+ " Aprobado ");
                  
              }else
                  System.out.println(notas[i]+"----->"+ " Suspenso ");
              suspensos++;
          }
          System.out.println(" O numero total de aprobados e "+aprobados
       +" \n E o de suspensos e "+suspensos);
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
   int pos =0;
    for(int i=0;i<notas.length;i++){
        
    if(notas[i]>notaMayor){
        notaMayor =notas[i];
     pos =i;
     
     System.out.println("La mayor nota es "+notaMayor);
    }
  
    
    }
   
}
public void visualizarAlumnos(){
    for(Alumno al:alumnos){
        System.out.println(Arrays.toString(alumnos));
    }
}

}     
            

