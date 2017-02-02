
package boletin_17;


public class Alumno implements Comparable<Alumno>  {
    int notas;
    String nome;
    
    public Alumno(){
        
    }

    public Alumno(int notas, String nome) {
        this.notas = notas;
        this.nome = nome;
    }

    public int getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Alumno{" + "notas=" + notas + ", nome=" + nome + '}';
    }
    
    @Override
    public int compareTo(Alumno comparar){
      int comparaNota = comparar.getNotas();
      return this.notas - comparaNota;
        
    }
   
}
