/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcuacionDeSegundoGrado;

import modelo.EcuacionesDeSegundoGrado;

/**
 *
 * @author palom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    EcuacionesDeSegundoGrado ECUACION1 = new EcuacionesDeSegundoGrado( 2 , -7 , 3 ) ;
        System.out.println(" TU ECUACION TIENE EL VALOR DE : " + ECUACION1.getDiscriminante());
        System.out.println(" RAICES : " + ECUACION1.getNumeroDeSoluciones());
        System.out.println(" VALOR 1 : " + ECUACION1.getRaiz1());
        System.out.println(" VALOR 2 : " + ECUACION1.getRaiz2());
        
        EcuacionesDeSegundoGrado ECUACION2 = new EcuacionesDeSegundoGrado( 1 ,7, -10 ) ;
        System.out.println(" TU ECUACION TIENE EL VALOR DE : " + ECUACION2.getDiscriminante());
        System.out.println("RAICES: " + ECUACION2.getNumeroDeSoluciones());
        System.out.println(" VALOR 1 : " + ECUACION2.getRaiz1());
        System.out.println(" VALOR 2: " + ECUACION2.getRaiz2());
        
        EcuacionesDeSegundoGrado ECUACION3 = new EcuacionesDeSegundoGrado( 1 , -4 , 4 ) ;
        System.out.println(" TU ECUACION TIENE EL VALOR DE : " + ECUACION3.getDiscriminante());
        System.out.println(" RAICES : " + ECUACION3.getNumeroDeSoluciones());
        System.out.println(" VALOR 1 : " + ECUACION3.getRaiz1());
        System.out.println(" VALOR 2 : " + ECUACION3.getRaiz2()); 
    }
}
