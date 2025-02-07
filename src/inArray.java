public class inArray {
    public static void main(String[] args) {
        String[] array = {"Tommaso", "Giulia", "Anna", "Francois", "Massimo"};
        String nuovaParola = "Niccolò";
        String[] risultato = inserisciParola(array, nuovaParola);
        System.out.println(java.util.Arrays.toString(risultato));
    }

    public static String[] inserisciParola(String[] array, String nuovaParola) {
        String[] risultato = new String[array.length + 1];
        risultato[0] = array[0];
        risultato[1] = array[1];
        risultato[2] = nuovaParola;
        risultato[3] = array[2];
        risultato[4] = array[3];
        risultato[5] = array[4];
        return risultato;

    }
}
