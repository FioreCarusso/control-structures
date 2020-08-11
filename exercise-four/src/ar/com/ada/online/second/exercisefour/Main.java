package ar.com.ada.online.second.exercisefour;

import java.util.Scanner;

/*a todos los trajes
que tienen un precio superior a $2500.00 se les aplicará un descuento de 15 %, a todos
los demás se les aplicará sólo 8%. Realice un algoritmo para determinar el precio final
que debe pagar una persona por comprar un traje y de cuánto es el descuento que
obtendrá.*/

public class Main {

    public static void main(String[] args) {

        double suitPrice= 0;
        double discount;
        double finalPrice;

        Scanner scan = new Scanner(System.in);

        System.out.println("Sistema de ventas\nIngrese el valor del traje");
         suitPrice = scan.nextDouble();

         if (suitPrice > 2500.00) {
             discount = suitPrice * 0.15;
         }else {
             discount = suitPrice * 0.08;
         }

         finalPrice = suitPrice - discount;

        System.out.println("El descuento es de: $"+ discount+ "\ny el precio final es de: $" + finalPrice);

    }
}
