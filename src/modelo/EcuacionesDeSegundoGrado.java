/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author palom
 */
public class EcuacionesDeSegundoGrado {
    
    private final double a;
    private final double b;
    private final double c;
    
    public EcuacionesDeSegundoGrado (double a, double b, double c){
        
        this.a = a ;
        this.b = b ;
        this.c = c ;
    
    }
    
    public double getCoeficienteA (){
        
        
        return this.a;
    
    }
    public double getCoeficienteB (){
        
        return this.b;
    
    }
    
    public double getCoeficienteC (){
        
        return this.c; 
    
    }
    
    public double getDiscriminante (){   
        double discriminante;
        discriminante = Math.pow (b, 2) - ( 4 * a * c ) ;
        return discriminante;
    
    }
    
    public int getNumeroDeSoluciones (){
        
        int NumRaices;
        double d = getDiscriminante ();
        if (d > 0){
            
        
            NumRaices = 2;
        
        }else if (d < 0 ){
            
            NumRaices = 0;
        
        }else {
            
            NumRaices = 1;
        
        }
        
        return NumRaices;
    
    }
    
    public double getRaiz1 (){
        
        double Raiz1 ;
        
        Raiz1= (- b + Math.sqrt(getDiscriminante())) / ( 2 * a) ;
        
        return Raiz1;
    
    }
    
    public double getRaiz2 (){
        
        double Raiz2;
        
        Raiz2= (- b - Math.sqrt(getDiscriminante())) / ( 2 * a ) ;  
        return Raiz2;
    }
}
    


