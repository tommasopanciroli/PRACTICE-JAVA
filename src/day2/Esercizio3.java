package day2;

import java.util.Scanner;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parola = "";
        while (!parola.equals(":q")) {
            System.out.println("Inserisci una parola (o :q per uscire): ");
            parola = scanner.nextLine();
            if (!parola.equals(":q")) {
                String[] parole = parola.split(",");
                for (int i = 0; i < parole.length; i++) {
                    System.out.print(parole[i] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
