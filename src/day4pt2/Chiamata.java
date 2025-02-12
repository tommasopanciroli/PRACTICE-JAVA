package day4pt2;

public class Chiamata {
    private int numeroTelefonato;
    private double minuti;

    public Chiamata (int num, double min) {
        this.minuti = min;
        this.numeroTelefonato = num;
    }

    public String getChiamata() {
        return "Numero di telefono: " + numeroTelefonato + ", " + minuti + " minuti";
    }

}
