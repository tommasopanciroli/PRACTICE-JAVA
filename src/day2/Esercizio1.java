package day2;

public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println(stringaPariDispari("Mistico"));
        System.out.println(stringaPariDispari("Ciao"));
        System.out.println(annoBisestile(2024));
        System.out.println(annoBisestile(2025));
    }

    public static boolean stringaPariDispari(String parola) {
        if(parola.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if(anno % 4 == 0 && anno % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
