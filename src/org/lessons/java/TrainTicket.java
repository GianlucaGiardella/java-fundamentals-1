package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanti chilometri voi percorrere ?");
        int inputDistance = scan.nextInt();

        System.out.println("Quanti anni hai ?");
        int inputYears = scan.nextInt();

        double basePrice = inputDistance * 0.21;
        System.out.println("Prezzo base: " + basePrice + " €");

        double finalPrice;

        if(inputYears >= 65) {
            finalPrice = basePrice * 0.6;
        } else if (inputYears < 18) {
            finalPrice = basePrice * 0.8;
        } else {
            finalPrice = basePrice;
        }

        System.out.print("Prezzo finale: " + finalPrice + " €");

        scan.close();
    }
}
