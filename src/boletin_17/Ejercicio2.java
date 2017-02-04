
package boletin_17;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;


public class Ejercicio2 {
   String nomes []= new String[4];
   int notas[]= new int[4];
 
   
   
   
   public String pedirNombre(){
      
  String nome = JOptionPane.showInputDialog("Introduce el nombre");
  return nome;
}
public int pedirNota(){
    
  int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota"));    
return nota;
    } 
    
    public void cargarArray(){
      
     
        
        for(int i=0;i<notas.length;i++){
           notas[i] = pedirNota();
           nomes[i] = pedirNombre();
        }
        
    }
      public void aprobadosSuspensos(){
          int aprobados=0;
          int suspensos=0;
          for(int i=0;i<notas.length;i++){
              
              if(notas[i]>5){
                  aprobados++;       
              }else       
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
 
    for(int i=0;i<notas.length;i++){
        
    if(notas[i]>notaMayor){
        notaMayor =notas[i];
        
    }
    }
   System.out.println("La mayor nota es "+notaMayor);
}
public void visualizarAlumnoAprobado(){
    
    for(int i=0;i<notas.length;i++){
        if(notas[i]>=5){
            System.out.println("O alumno "+nomes[i]+" ten a nota "+notas+" Está aprobado ");
            
        }else if(notas[i]<5){
        System.out.println(" O alumno "+nomes[i]+" e ten a nota "+notas[i]+" Está suspenso ");
    }
}
}

public void menorAmaior(){
   
    Alumno[] alu = new Alumno[4];
/*corregido,se crea array de objetos incluyendo los otros dos arrays 
para poder comparar nombre y notas
*/
   for(int i=0;i<alu.length;i++){
     Alumno a = new Alumno();
     a.setNotas(notas[i]);
     a.setNome(nomes[i]);
     alu[i]=a; // guardamos objeto tipo alumno con nombre "A" dentro de alu.
   }
    Arrays.sort(alu);
    for(int i=0;i<alu.length;i++){
        System.out.println(alu[i]);
    }
    
}

public void atoparAlumno(){
    
    boolean atopado = false;
    String encontrar = JOptionPane.showInputDialog("Elixe o nome do alumno");
    for(int i=0;i<nomes.length;i++){
    if(encontrar.equals(nomes[i])){
        
        System.out.println("O nome  do alumno e " + nomes[i]+" E a sua nota e "+notas[i]);
        atopado = true;
        break;
    }
    else{
        System.out.println(" O alumno non está ");
    }
      
}
}     
}           

