package day5;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------ES1-------");
        double numeroDecimale = 23.4;
        int numeroIntero = (int) numeroDecimale;
        System.out.println(numeroIntero);

        System.out.println("------ES2------");
        long numeroLungo= 29394229442L;
        int numeroIntero2 = (int) numeroLungo;
        System.out.println(numeroIntero2);

        System.out.println("------ES3------");
        float numeroVirgola = 12.3f;
        double numeroDecimale2 = (double) numeroVirgola;
        System.out.println(numeroDecimale2);

        System.out.println("------ES4------");
        String numeroStringa = "21.6";
        double numeroDecimale3 = Double.parseDouble(numeroStringa);
        System.out.println(numeroDecimale3);

        System.out.println("------ES5------");
        int numeroInter3 = 5;
        boolean positivo = numeroInter3 > 0;
        System.out.println("Il numero è positivo? " + positivo);

        System.out.println("------ES6------");
        int numeroIntero4 = 7;
        boolean pari = numeroIntero4 % 2 == 0;
        System.out.println("Il numero è pari? " + pari);

        System.out.println("------ES7------");
        int numeroIntero5 = 5;
        int numeroIntero6 = 8;
        boolean maggiore = numeroIntero5 > numeroIntero6;
        System.out.println("Il primo numero è maggiore del secondo? " + maggiore);

        System.out.println("------ES8------");
        int numeroIntero7 = 5;
        int numeroIntero8 = 6;
        boolean diversi = numeroIntero7 != numeroIntero8;
        System.out.println("I due numeri sono diversi? " + diversi);

        System.out.println("------ES9------");
        String str1 = "ciao";
        String str2 = "ciao";
        boolean uguali = str1 == str2;
        System.out.println("Le due stringhe sono uguali? " + uguali);

        System.out.println("------ES10------");
        String str3 = "ciao";
        String str4 = "ciaone";
        boolean lunghezza = str3.length() > str4.length();
        System.out.println("La prima stringa è più lunga della seconda? " + lunghezza);

    }
}
