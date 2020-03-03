/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadestructurascontrol;

import java.util.Scanner;

/**
 *
 * @author JorgeRv
 */
public class ActividadEstructurasControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int d, d2, d3 = 0;

        Scanner teclado = new Scanner(System.in);

        int n1, a;
        int n2;
        int n3;
        int n4;
        int suma = 0;
        int contar = 0;
        int resultado = 0;

//        do {
        System.out.println("Elija una opción según su ejercicio favorito");
        System.out.println("1. Estructura if");
        System.out.println("2. Estructura else if");
        System.out.println("3. Ciclo for");
        System.out.println("4. Ciclo while");
        System.out.println("5. Ciclo do while");
        System.out.println("6. Salir del sistema");

        d = teclado.nextInt();

        switch (d) {
            case 1:
                System.out.println("Es una comparación entre dos números");
                System.out.println("Por favor ingresa un primer número");
                n1 = teclado.nextInt();
                System.out.println("Por favor ingresa otro número");
                n2 = teclado.nextInt();

                if (n1 == n2) {
                    System.out.println("Ambos números son iguales");

                } else {
                    System.out.println("Ambos números no son iguales");
                }
                System.out.println("-----------------------------------------------");
                System.out.println("Elija otra opción según su ejercicio favorito");
                d = teclado.nextInt();

            case 2:
                System.out.println("Estructura else if");

                System.out.println("Por favor ingresa un número");
                n1 = teclado.nextInt();
                if (n1 > 0) {
                    System.out.println("El número que usted eligio es mayor que cero");
                } else if (n1 < 0) {
                    System.out.println("El número es menor que cero");
                } else {
                    System.out.println("El número es igual a cero");
                }

                System.out.println("-----------------------------------------------");
                System.out.println("Elija otra opción según su ejercicio favorito");
                d = teclado.nextInt();
//                    break;
            case 3:
                System.out.println("Ciclo for");

//                System.out.println("Por favor ingresa un número");
//                n1 = teclado.nextInt();
                for (int i = 0; i < 5; i++) {
                    System.out.println("Ingrese un número");
                    n3 = teclado.nextInt();
                    suma = n3 + suma;
                    if (n3 > 1000) {
                        contar++;

                    }

                }

                System.out.println("La suma total es: " + suma);
                System.out.println("Los mayores a Q 1,000 son: " + contar);

                System.out.println("-----------------------------------------------");
                System.out.println("Elija otra opción según su ejercicio favorito");
                d = teclado.nextInt();
//                break;
            case 4:
                System.out.println("Ciclo While");
                System.out.println("Ingrese un número");
                d3 = teclado.nextInt();
                while (d3 != 0) {
                    if (d3 % 2 == 0) {
                        System.out.println("Numero par");
                    } else {
                        System.out.println("Número impar");
                    }
                    System.out.println("Ingrese un numero");
                    d3 = teclado.nextInt();
                }

                System.out.println("-----------------------------------------------");
                System.out.println("Elija otra opción según su ejercicio favorito");
                d = teclado.nextInt();

            //   break;
            case 5:
                System.out.println("Ciclo do while");
//              break;

                do {
                    System.out.println("Ingrese un numero");
                    d2 = teclado.nextInt();
                    if (d2 >= 0 && d2 <= 5) {
                        System.out.println("el resultado de multiplicar " + d2 + " *100 es = " + d2 * 100);
                        System.out.println("el resultado de multiplicar " + d2 + " *100 es = " + d2 * 1000);
                    }
                } while (d2 >= 0 && d2 <= 5);

                System.out.println("-----------------------------------------------");
                System.out.println("Elija otra opción según su ejercicio favorito");
                d = teclado.nextInt();
            default:
                System.out.println("Salir");
                break;
        }

    }

}
