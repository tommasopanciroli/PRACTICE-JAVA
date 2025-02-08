package day2;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int numero = scanner.nextInt();
        contoAllaRovescia(numero);
        scanner.close();
    }

    public static void contoAllaRovescia(int numero) {
        System.out.println("Conto alla rovescia da " + numero);

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
