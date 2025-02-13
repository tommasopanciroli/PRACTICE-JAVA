package day4pt3;

import java.util.List;

public class Carrello {
    private List<Articolo> elencoArticoli;
    private int totaleCosto;
    private int codCliente;

    public Carrello( List<Articolo> elenco, int tot, int code) {

        this.elencoArticoli = elenco;
        this.totaleCosto = tot;
        this.codCliente = code;
    }

    public int getCodCliente() {
        return this.codCliente;
    }

    public List<Articolo> getElencoArticoli() {
        return this.elencoArticoli;
    }

    public int getTotaleCosto() {
        return this.totaleCosto;
    }

    public String toString() {
        return "Carrello{" +
                "elencoArticoli=" + elencoArticoli +
                ", totaleCosto=" + totaleCosto +
                ", codCliente=" + codCliente +
                '}';
    }
}
