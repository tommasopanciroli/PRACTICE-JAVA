package esercizio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String risultato = usaScanner("Inserisci il primo valore: ", "Inserisci il secondo valore: ", "Inserisci il terzo valore: ");
        System.out.println(risultato);
    }

    public static String usaScanner(String str1, String str2, String str3) {
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[2];

        System.out.println(str1);
        String input1 = scanner.nextLine();
        System.out.println(str2);
        String input2 = scanner.nextLine();
        System.out.println(str3);
        String input3 = scanner.nextLine();

        String normale = input1 + " " + input2 + " " + input3;
        String invertito = input3 + " " + input2 + " " + input1;

        return normale + "\n" + invertito;
    }
}
