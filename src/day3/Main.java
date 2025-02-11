package day3;

public class Main {

    public static void main(String[] args) {
        System.out.println(differenza(23.3, 12.5));
        System.out.println(differenza(12.1, 20.3));
        System.out.println(stampaLunghezza("Francois"));
        String parola = "nessi";
        System.out.println(parola.toUpperCase());
        System.out.println(convertiInStringa(44));
    }

    public static double differenza(double n1, double n2) {
        if (n1 > n2) {
            return n1 - n2;
        } else {
            return n2 - n1;
        }
    }

    public static int stampaLunghezza(String str) {
        return str.length();
    }

    public static String convertiInStringa(int num) {
       int numero= num;
       String stringa = String.valueOf(numero);
       return "Il numero convertito in stringa è: " + stringa;
    }
}
