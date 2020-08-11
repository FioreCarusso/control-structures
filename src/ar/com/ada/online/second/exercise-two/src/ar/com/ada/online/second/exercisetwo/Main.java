package ar.com.ada.online.second.exercisetwo;
/*Realice un algoritmo para determinar si un número es positivo o negativo.
Represéntelo en pseudocódigo y diagrama de flujo.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("Sistema para determinar si un numero es positivo o negativo\nIngrese el numero");
        number = scan.nextInt();

        if (number >= 0) {
            System.out.println("El numero es POSITIVO");
        }else {
            System.out.println("El numero es NEGATIVO");
        }
    }
}
