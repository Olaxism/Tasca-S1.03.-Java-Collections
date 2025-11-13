package sprint_1.tasca_3.nivel_1.ejercici_2;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

    public static void main (String[] args) {

        List<Integer> evens = new ArrayList<>();

        evens.add(2);
        evens.add(4);
        evens.add(6);

        System.out.println("Primera Lista: " + evens );

        List<Integer> evens2 = new ArrayList<>();

        java.util.ListIterator<Integer> listIterator = evens.listIterator(evens.size());

        while (listIterator.hasPrevious()) {
            int num = listIterator.previous();
            evens2.add(num);
        }

        System.out.println("Segunda lista: " + evens2);
    }
}
