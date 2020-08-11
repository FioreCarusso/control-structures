package ar.com.ada.online.second.exerciseone;

/*Se desea implementar un algoritmo para determinar cuál de dos valores
proporcionados es el mayor.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int biggerNumber;

        Scanner scan = new Scanner(System.in);
        System.out.println("Sistema para determinar cual es el numero mayor\nIngrese el primer valor");
        firstNumber = scan.nextInt();
        System.out.println("Ingrese el segundo valor");
        secondNumber = scan.nextInt();

        if (firstNumber > secondNumber) {
            biggerNumber = firstNumber;
        } else {
            biggerNumber = secondNumber;
        }

        System.out.print("El numero mayor es: " + biggerNumber);
    }
}