package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        String name, surname, favouriteColor;
        int birthDateSum;

        Scanner userInput = new Scanner(System.in);

        System.out.println("App Genera Password");

        System.out.println("Inserisci il tuo nome");

        name = userInput.nextLine();

        System.out.println("Inserisci il tuo cognome");

        surname = userInput.nextLine();

        System.out.println("Inserisci il tuo colore preferito");

        favouriteColor = userInput.nextLine().trim().toLowerCase();

        System.out.println("Inserisci il tuo giorno di nascita nel formato gg");

        birthDateSum = userInput.nextInt();

        System.out.println("Inserisci il tuo mese di nascita nel formato mm");

        birthDateSum += userInput.nextInt();

        System.out.println("Inserisci il tuo anno di nascita nel formato aaaa");

        birthDateSum += userInput.nextInt();

        String password = name + "-" + surname + "-" + favouriteColor + "-" + birthDateSum;

        System.out.println(
                "La tua password generata è: " + password);

        userInput.close();

    }
}
