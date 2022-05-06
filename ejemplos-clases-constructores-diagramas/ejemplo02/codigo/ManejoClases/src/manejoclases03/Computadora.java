
package manejoclases03;

public class Computadora {
    private String tipoProcesador;
    private double memoria;
    
    // métodos establecer para cada atributo
    public void establecerTipoProcesador(String n){
        tipoProcesador = n;
    }
    
    public void establecerMemoria(double n){
        memoria = n;
    }
    
    public String obtenerTipoProcesador(){
        return tipoProcesador;
    }
    
    public double obtenerMemoria(){
        return memoria;
    }
    
    public Computadora(double m){
        memoria = m; 
 
    }
    public Computadora(String tipo){
        tipoProcesador = tipo; 
 
    }
    public Computadora(String tipo, double men){
        tipoProcesador = tipo;
        memoria = men;
 
    }
    
        
    
    
}
