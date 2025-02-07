package esercizio3;

public class Main {
    public static void main(String[] args) {
        System.out.println(perimetroRettangolo(3.3, 5));
        System.out.println(pariDispari(4));
        System.out.println("L'area del triangolo è: " + areaTriangolo(3.3, 4.2));
    }

    public static double perimetroRettangolo(double latoLungo, double latoCorto) {
        return ((latoLungo + latoCorto) * 2);
    }

    public static String pariDispari(int numero) {
        if (numero % 2 == 0) {
            return "il numero è pari: " + numero;
        } else {
            return "il numero é dispari: " + numero;
        }
    }

    public static double areaTriangolo(double base, double altezza) {
        return (base * altezza) / 2;
    }
}
