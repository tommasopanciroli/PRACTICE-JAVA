package day2;

import java.util.Scanner;


public class Esercizio3 {
    public static void main(String[] args) {
        String stringa = "";
        String finale = "";
        Scanner scanner = new Scanner(System.in);
        while (!stringa.equals(":q")) {
            System.out.println("Inserisci una stringa: ");
            stringa = scanner.nextLine();
            for (int i = 0; i < stringa.length(); i++) {
                finale += stringa.charAt(i) + ",";
            }
            System.out.println(finale);
            finale = "";
        }
        scanner.close();

    }


}

