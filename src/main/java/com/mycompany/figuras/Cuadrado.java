
package com.mycompany.figuras;


public class Cuadrado {
    
    public float longitudLadoCentimetro;
    
    public Cuadrado(){
        
    }

    public Cuadrado(float logitudLadoCentimetro) {
        this.longitudLadoCentimetro = logitudLadoCentimetro;

    }

    public void imprimir() {
        System.out.println("longitudLadoCentimetro: " + longitudLadoCentimetro);

    }

    public float calcularAreaCuadrado() {
        
        return longitudLadoCentimetro*longitudLadoCentimetro;

    }
    
    public float calcularPerimetroCuadrado(){
        
        return longitudLadoCentimetro*4;
    }
    
}
    

