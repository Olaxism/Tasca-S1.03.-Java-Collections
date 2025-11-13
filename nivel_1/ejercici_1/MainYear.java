package sprint_1.tasca_3.nivel_1.ejercici_1;

import sprint_1.tasca_3.nivel_1.ejercici_1.classes.Month;
import sprint_1.tasca_3.nivel_1.ejercici_1.classes.Year;

import java.util.HashSet;
import java.util.Iterator;

public class MainYear {

    public static void main(String[] args) {

        Year y1 = new Year();

        Month m1 = new Month("Enero");
        Month m2 = new Month("Febrero");
        Month m3 = new Month("Marzo");
        Month m4 = new Month("Abril");
        Month m5 = new Month("Mayo");
        Month m6 = new Month("Junio");
        Month m7 = new Month("Julio");
        Month m8 = new Month("Agosto");
        Month m9 = new Month("Septiembre");
        Month m10 = new Month("Octubre");
        Month m11 = new Month("Noviembre");
        Month m12 = new Month("Diciembre");


        y1.addMonth(m1);
        y1.addMonth(m2);
        y1.addMonth(m3);
        y1.addMonth(m4);
        y1.addMonth(m5);
        y1.addMonth(m6);
        y1.addMonth(m7);
        y1.addMonth(m9);
        y1.addMonth(m10);
        y1.addMonth(m11);
        y1.addMonth(m12);


        System.out.println(y1);

        y1.getMonths().add(7, m8);

        System.out.println(y1);

        HashSet<Month> YearHS = new HashSet<>();

        YearHS.add(m1);
        YearHS.add(m2);
        YearHS.add(m3);
        YearHS.add(m4);
        YearHS.add(m5);
        YearHS.add(m6);
        YearHS.add(m7);
        YearHS.add(m8);
        YearHS.add(m9);
        YearHS.add(m10);
        YearHS.add(m11);
        YearHS.add(m12);
        YearHS.add(m2);
        YearHS.add(m4);

        System.out.println("Esta es la coleccion YearHS asegurando que no permite duplicados" + YearHS);

        for (Month month : YearHS) {
            System.out.println("Recorriendo " + month);
        }

        Iterator<Month> iterator = YearHS.iterator();
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println("Usando iterator para recorrer: " + month);
        }
    }
}
