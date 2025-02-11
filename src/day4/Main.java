package day4;


public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(3, 5);
        System.out.println(rettangolo.stampaRettangolo());


        Rettangolo rettangolo1 = new Rettangolo(5, 5);
        Rettangolo rettangolo2 = new Rettangolo(4, 4);
        stampaDueRettangoli(rettangolo1, rettangolo2);

    }

    public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
        System.out.println("Area del primo: " + ret1.area());
        System.out.println("Perimetro del primo: " + ret1.perimetro());
        System.out.println("Area del secondo: " + ret2.area());
        System.out.println("Perimetro del secondo: " + ret2.perimetro());
        System.out.println("Somma delle due aree: ");
        System.out.print(ret1.area() + ret2.area());
        System.out.println("\nSomma dei due perimetri: ");
        System.out.print(ret1.perimetro() + ret2.perimetro());

    }
}
