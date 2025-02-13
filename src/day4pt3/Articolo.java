package day4pt3;

public class Articolo {

    private int codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int pezziMagazzino;

    public Articolo(int cod, String descr, int price, int rimanenze) {
        this.codiceArticolo = cod;
        this.prezzo = price;
        this.descrizioneArticolo = descr;
        this.pezziMagazzino = rimanenze;
    }

    public int getCodiceArticolo() {
        return this.codiceArticolo;
    }

    public int getPezziMagazzino() {
        return this.pezziMagazzino;
    }

    public String getDescrizioneArticolo() {
        return this.descrizioneArticolo;
    }

    public int getPrezzo() {
        return this.prezzo;
    }

    public String toString() {
        return "Articolo{" +
                "codiceArticolo=" + codiceArticolo +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", prezzo=" + prezzo +
                ", pezziMagazzino=" + pezziMagazzino +
                '}';
    }
}
