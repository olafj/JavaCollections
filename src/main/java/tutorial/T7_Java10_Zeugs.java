package tutorial;

import java.util.List;
import java.util.Map;

public class T7_Java10_Zeugs {

    public static void main(String[] args) {

        // Wenn man schnell mal Werte in eine Liste packen muss (z.B. Konstante, statische Liste)

        var benutzerRollen = List.of("user", "admin", "superadmin");

        // oder auch eine Map

        var wochenTage = Map.of("mo", "Montag", "di", "Dienstag", "mi", "Mittwoch");
        System.out.println(wochenTage.get("mo"));

        // einfachste For-Schleife mit Lambda

            benutzerRollen.forEach(rolle -> {
                System.out.println(rolle);
            });

        wochenTage.forEach((key, value) -> {
            System.out.println("key=" + key + " => value=" + value);
        });


    }
}
