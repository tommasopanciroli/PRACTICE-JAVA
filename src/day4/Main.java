package day4;


import day4pt2.Chiamata;
import day4pt2.Sim;
import day4pt3.Articolo;
import day4pt3.Carrello;
import day4pt3.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("------ESERCIZIO 1------");
        Rettangolo rettangolo = new Rettangolo(3, 5);
        System.out.println(rettangolo.stampaRettangolo());


        Rettangolo rettangolo1 = new Rettangolo(5, 5);
        Rettangolo rettangolo2 = new Rettangolo(4, 4);
        stampaDueRettangoli(rettangolo1, rettangolo2);

        System.out.println("\n----------ESERCIZIO 2-----------");
        Chiamata chiamataLuca = new Chiamata(222333444, 1.8);
        Chiamata chiamataGiovanni = new Chiamata(222333444, 3.4);
        Chiamata chiamataMassimo = new Chiamata(222333444, 3.2);
        Chiamata chiamataFrancois = new Chiamata(222333444, 5.8);
        Chiamata chiamataAnna = new Chiamata(222333444, 10.4);
        Sim simTommaso = new Sim(33234356, 10, new Chiamata[]{chiamataFrancois, chiamataAnna, chiamataLuca, chiamataGiovanni, chiamataMassimo});
        simTommaso.stampaSim();

        System.out.println("--------ESERCIZIO 3--------");
        Cliente Tommaso = new Cliente(101, "Tommaso Panciroli", "tommypanci@gmail.com", LocalDate.of(2025, 2, 10));
        Articolo iPhone12 = new Articolo(232, "telefono cellulare", 800, 300);
        Articolo macBookPro = new Articolo(233, "Laptop", 1800, 300);
        Articolo airPods = new Articolo(234, "Cuffiette bluetooth", 300, 300);
        List<Articolo> articoliTommaso = new ArrayList<>();
        articoliTommaso.add(iPhone12);
        articoliTommaso.add(macBookPro);
        articoliTommaso.add(airPods);
        int total = 0;
        for (int i = 0; i < articoliTommaso.size(); i++) {
            total += articoliTommaso.get(i).getPrezzo();
        }
        Carrello carrelloTommaso = new Carrello(articoliTommaso, total, Tommaso.getCodiceCliente());
        System.out.println(carrelloTommaso);
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
