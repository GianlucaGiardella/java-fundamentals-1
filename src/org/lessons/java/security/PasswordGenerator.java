package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire il nome:");
        String inputFirstName = scan.nextLine();

        System.out.println("Inserire il cognome:");
        String inputLastName = scan.nextLine();

        System.out.println("Inserire il colore preferito:");
        String inputColor = scan.nextLine();

        System.out.println("Inserire il giorno di nascita:");
        byte inputBirthDay = scan.nextByte();

        System.out.println("Inserire il mese di nascita:");
        byte inputBirthMonth = scan.nextByte();

        System.out.println("Inserire l'anno di nascita:");
        int inputBirthYear = scan.nextInt();

        String password = inputFirstName + "-" + inputLastName + "-" + inputColor + "-" + (inputBirthDay + inputBirthMonth + inputBirthYear);

        System.out.println("La tua password è: " + password);

        scan.close();
    }
}
