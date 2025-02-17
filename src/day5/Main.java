package day5;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------ES1-------");
        double numeroDecimale = 23.4;
        int numeroIntero = (int) numeroDecimale;
        System.out.println(numeroIntero);

        System.out.println("------ES2------");
        long numeroLungo = 29394229442L;
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

        System.out.println("------ES11------");
        int anno = 2024;
        boolean annoBisestile = anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0;
        System.out.println("L'anno è bisestile? " + annoBisestile);

        System.out.println("------ES12------");
        String testo = "";
        boolean vuotaONull = testo == null || testo.isEmpty();
        System.out.println("La stringa è vuota o null? " + vuotaONull);

        System.out.println("------ES13------");
        int numeroIntero9 = 9;
        boolean positivoEDispari = numeroIntero9 > 0 && numeroIntero9 % 2 != 0;
        System.out.println("Il numero è positivo e dispari? " + positivoEDispari);

        System.out.println("------ES14------");
        int numeroIntero10 = 30;
        boolean pariEDivisibile = numeroIntero10 % 2 == 0 && numeroIntero10 % 3 == 0;
        System.out.println("Il numero è divisibile per tre e pari? " + pariEDivisibile);

        System.out.println("------ES15------");
        String str5 = "instagram";
        boolean iniziaPer = str5.startsWith("A") || str5.startsWith("B");
        System.out.println("La stringa inizia per A o per B? " + iniziaPer);

        System.out.println("------ES16------");
        int numeroIntero11 = -3;
        boolean negativoOZero = numeroIntero11 == 0 || numeroIntero11 < 0;
        System.out.println("Il numero è 0 o negativo? " + negativoOZero);

        System.out.println("------ES17------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("------ES18------");
        char lettera = 'A';
        if (Character.isUpperCase(lettera)) {
            System.out.println("La lettera è maiuscola");
        } else if (Character.isLowerCase(lettera)) {
            System.out.println("La lettera è minuscola");
        } else {
            System.out.println("Il carattere non è una lettera");
        }

        System.out.println("------ES19------");
        int anno2 = 2023;
        if (anno2 % 4 == 0 && anno2 % 100 != 0 || anno2 % 400 == 0){
            System.out.println("L'anno è bisestile.");
        } else {
            System.out.println("L'anno " + anno2 +  " non è bisestile.");
        }

        System.out.println("------ES20------");
        int numeroIntero12 = 10;
        if (numeroIntero12 > 0 && numeroIntero12 % 2 == 0){
            System.out.println("Il numero è pari e positivo");
        } else {
            System.out.println("Il numero è negativo o dispari");
        }

        System.out.println("------ES21------");
        char carattere = 'e';
        if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
            System.out.println("Il carattere è una vocale");
        } else {
            System.out.println("Il carattere è una consonante");
        }

        System.out.println("------ES22------");
        int etaPersona = 12;
        if (etaPersona >= 18) {
            System.out.println("La persona è maggiorenne");
        } else {
            System.out.println("La persona è minorenne");
        }

    }
}
