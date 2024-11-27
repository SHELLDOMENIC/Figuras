/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras;

import java.util.Scanner;

/**
 *
 * @author and_j
 */
public class Figuras {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int menu = 0;

        System.out.println("Bienvenidos");
        System.out.println("Seleccione según su conveniencia:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        menu = scanner.nextInt();
        switch(menu){
            case 1:System.out.println("Caso 1: Círculo");
            double radio;
            double diametroCirculo;
            double calcularAreaCirculo;
            double calcularPerimetroCirculo;
            double PI = 3.14159265359;
                System.out.println("Ingrese el Diametro de el circulo");
                diametroCirculo = scanner.nextDouble();
                 radio = diametroCirculo / 2 * PI;
                 calcularAreaCirculo = PI * ( radio * radio );
                 calcularPerimetroCirculo = 2 * PI * radio;
                System.out.println("El radio es: "+radio);
                System.out.println("El Area del circulo es: "+calcularAreaCirculo);
                System.out.println("El perimetro del Circulo es: " +calcularPerimetroCirculo);
                break;
            case 2:System.out.println("Caso 2: Rectángulo");
            float baseRectangulo;
            float alturaRectangulo;
            float calcularAreaRectangulo;
            float calcularPerimetroRectangulo;
                System.out.println("Ingrese la base del rectangulo");
                baseRectangulo = scanner.nextFloat();
                System.out.println("Ingrese la altura del Rectangulo");
                alturaRectangulo = scanner.nextFloat();
                calcularAreaRectangulo = ( baseRectangulo * alturaRectangulo);
                calcularPerimetroRectangulo = 2*(baseRectangulo + alturaRectangulo);
                System.out.println("El Area del Rectangulo es: "+calcularAreaRectangulo);
                System.out.println("El Perimetro del Rectangulo es : "+calcularPerimetroRectangulo);
        
        }
    }
}
