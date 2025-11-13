package sprint_1.tasca_3.nivel_1.ejercici_3;

import java.util.*;

public class Capitals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("Albania", "Tirana");
        capitals.put("Andorra", "Andorra la Vella");
        capitals.put("Armenia", "Erevan");
        capitals.put("Azerbaijan", "Baku");
        capitals.put("Belarus", "Minsk");
        capitals.put("Belgium", "Brussels");
        capitals.put("Bosnia y Herzegovina", "Sarajevo");
        capitals.put("Bulgaria", "Sofia");
        capitals.put("Croatia", "Zagreb");
        capitals.put("Cyprus", "Nicosia");
        capitals.put("Czechia", "Prague");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("Estonia", "Tallin");
        capitals.put("Finland", "Helsinki");
        capitals.put("France", "Paris");
        capitals.put("Georgia", "Atlanta");
        capitals.put("Germany", "Berlin");
        capitals.put("Greece", "Athens");
        capitals.put("Hungary", "Budapest");
        capitals.put("Iceland", "Reikiavik");
        capitals.put("Ireland", "Dublin");
        capitals.put("Italy", "Rome");
        capitals.put("Kazakhstan", "Nur-Sultan");
        capitals.put("Kosovo", "Pristina");
        capitals.put("Latvia", "Riga");
        capitals.put("Liechtenstein", "Vaduz");
        capitals.put("Lithuania", "Vilnius");
        capitals.put("Luxembourg", "Luxembourg");
        capitals.put("Malta", "Valletta");
        capitals.put("Moldova", "Chisinau");
        capitals.put("Monaco", "Monte Carlo");
        capitals.put("Montenegro", "Podgorica");
        capitals.put("Netherlands", "Amsterdam");
        capitals.put("North Macedonia", "Skpje");
        capitals.put("Norway", "Oslo");
        capitals.put("Poland", "Warsaw");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Romania", "Bucharest");
        capitals.put("Rusia", "Moscow");
        capitals.put("San Marino", "San Marino");
        capitals.put("Serbia", "Belgrade");
        capitals.put("Slovakia", "Bratislava");
        capitals.put("Slovenia", "Ljubljana");
        capitals.put("Spain", "Madrid");
        capitals.put("Sweden", "Stockholm");
        capitals.put("Switzerland", "Bern");
        capitals.put("Turkey", "Ankara");
        capitals.put("Ukraine", "Kyiv");
        capitals.put("United Kingdom", "London");
        capitals.put("Vatican City", "Vatican City");


        System.out.println("Hola!  Vamos a adivinar capitales. Cual es tu nombre?");
        String Username = sc.next();
        System.out.println("Muy bien!! Saludos " + Username + " tienes 10 intentos");

        Random random = new Random();
        List<String> countries = new ArrayList<>(capitals.keySet());

        int tries = 10;
        int score = 0;

        do {
            String randomCountry = countries.get(random.nextInt(countries.size()));
            System.out.println("Cual sería la capital de " + randomCountry);
            String option = sc.next();

            if (option.equalsIgnoreCase(capitals.get(randomCountry))) {
                score++;
                tries--;
                System.out.println("Correcto!!! Tu puntuacion es " + score + " y te quedan " + tries + " intentos.");
            } else {
                tries--;
                if (tries > 0) {
                    System.out.println("Incorrecto!!! Te quedan " + tries + " intentos.");
                } else {
                    System.out.println("Uff!! se acabó. [[GAME OVER]] La capital era " + (capitals.get(randomCountry)));
                }
            }
        }
            while (tries > 0) ;

            System.out.println("Tu puntuacion final es: " + score);
        }
    }