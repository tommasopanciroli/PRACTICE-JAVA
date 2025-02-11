package day4;

public class Rettangolo {
    private int base;
    private int altezza;

    public Rettangolo (int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public int getAltezza(){
        return altezza;
    }

    public int getBase() {
        return base;
    }

    public int perimetro() {
        return (this.base + this.altezza) * 2;
    }

    public int area() {
        return this.base * this.altezza;
    }

    public String stampaRettangolo() {
        return "Il perimetro è " + perimetro() +  " mentre l'area è " + area();
    }
}
