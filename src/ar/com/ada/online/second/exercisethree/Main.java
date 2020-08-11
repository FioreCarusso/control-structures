package ar.com.ada.online.second.exercisethree;

/*Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad
de lápices considerando que si son 1000 o más el costo es de 85$ c/lapiz; de lo
contrario, el precio es de 90$ c/lapiz.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPencils;
        int price;

        System.out.println("Ingrese la cantidad de lapices");
        numberOfPencils = scan.nextInt();

        if (numberOfPencils >= 1000) {
            price = numberOfPencils * 85;
        }else{
            price = numberOfPencils * 90;
        }
        System.out.println("El precio por " +numberOfPencils+ " lapices es de: $" + price);
    }
}
