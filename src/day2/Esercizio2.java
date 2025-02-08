package day2;

public class Esercizio2 {
    public static void main(String[] args) {
        System.out.println(toString(0));
        System.out.println(toString(4));
    }

    public static String toString(int numero) {
        switch (numero) {
            case 0:
                return "zero";
            case 1:
                return "uno";

            case 2:
                return "due";

            case 3:
                return "tre";

            default:
                return "Errore, valore non risconosciuto";
        }
    }
}
