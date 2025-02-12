package day4pt2;

public class Sim {
    private int numeroDiTelefono;
    private double credito;
    private Chiamata[] listaChiamate = new Chiamata[5];

    public Sim (int numTel, double cred, Chiamata[] list) {
        this.credito = cred;
        this.numeroDiTelefono = numTel;
        this.listaChiamate = list;
    }


    public int getNumeroDiTelefono() {
        return this.numeroDiTelefono;
    }

    public double getCredito() {
        return this.credito;
    }


    public void stampaSim() {
        System.out.println(credito);
        System.out.println(numeroDiTelefono);
        for (int i = 0; i < 5; i++) {
            System.out.println(listaChiamate[i].getChiamata());
        }
    }
}
