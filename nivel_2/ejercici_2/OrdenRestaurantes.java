package sprint_1.tasca_3.nivel_2.ejercici_2;

import sprint_1.tasca_3.nivel_2.ejercici_1.classes.Restaurant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OrdenRestaurantes {

    public static void main (String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant r1 = new Restaurant ("Oishi", 7);
        Restaurant r2 = new Restaurant ("El sazón", 8);
        Restaurant r3 = new Restaurant ("Can Punyetes", 9);
        Restaurant r4 = new Restaurant ("Oishi", 7);
        Restaurant r5 = new Restaurant ("El Pendejo", 8);
        Restaurant r6 = new Restaurant ("El sazón", 5);

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);
        restaurants.add(r5);
        restaurants.add(r6);

        List<Restaurant> restaurants2 = new ArrayList<>(restaurants);
        restaurants2.sort((res1,res2) -> Integer.compare(res2.getScore(), res1.getScore()));

        for (Restaurant r : restaurants2) {
             System.out.println(r.getName() + " - Puntuación: " + r.getScore());
        }
    }
}
