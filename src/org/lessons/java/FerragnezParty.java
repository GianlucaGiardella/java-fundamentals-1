package org.lessons.java;

import java.util.Scanner;

public class FerragnezParty {
    public static void main(String[] args) {
        String[] partyGuests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("Nome e cognome ?");

        Scanner scan = new Scanner(System.in);
        String inputName = scan.nextLine();

        boolean found = false;

        //Enhanced For
        for (String partyGuest : partyGuests) {
            if (inputName.equals(partyGuest)) {
                found = true;
                break;
            }
        }

        //Indexed For
        for (int i = 0; i < partyGuests.length; i++) {
            if (inputName.equals(partyGuests[i])) {
                found = true;
                break;
            }
        }

        //While
        int index = 0;
        while (!found && index < partyGuests.length) {
            if (inputName.equals(partyGuests[index])) {
                found = true;
            }
            index++;
        }

        System.out.println(found ? "Benvenuto alla festa" : "Non sei stato invitato");

        scan.close();
    }
}
