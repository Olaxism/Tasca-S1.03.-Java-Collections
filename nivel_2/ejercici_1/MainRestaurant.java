package sprint_1.tasca_3.nivel_2.ejercici_1;

import sprint_1.tasca_3.nivel_2.ejercici_1.classes.Restaurant;
import java.util.HashSet;

public class MainRestaurant {

    public static void main (String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant r1 = new Restaurant("Oishi", 7);
        Restaurant r2 = new Restaurant ("El sazón", 8);
        Restaurant r3 = new Restaurant ("Can Punyetes", 9);
        Restaurant r4 = new Restaurant ("Oishi", 7);
        Restaurant r5 = new Restaurant ("El Pendejo", 8);
        Restaurant r6 = new Restaurant ("El sazón", 5);

        System.out.println(restaurants.add(r1));
        System.out.println(restaurants.add(r2));
        System.out.println(restaurants.add(r3));
        System.out.println(restaurants.add(r4));
        System.out.println(restaurants.add(r5));
        System.out.println(restaurants.add(r6));

        System.out.println("Estos son los restaurantes agregados al HashSet: " + restaurants);

    }
}
