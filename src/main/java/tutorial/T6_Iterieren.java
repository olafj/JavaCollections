package tutorial;

import hilfklassen.Fahrzeug;

import java.util.ArrayList;

public class T6_Iterieren {

    public static void main(String[] args) {

        // Liste und Maps sind dazu da, weil man es meistens mit eine größeren Menge von Daten zu tun hat,
        // deren Anzahl man eigtl nicht kennt, z.B. Einwohner in der Einwohnerdatenbank
        // Oder Fahrzeuge beim TÜV

        // Häufig will man etwas mit allen Einträgen einer Liste machen

        ArrayList<Fahrzeug> eineListeVonFahrzeugen = new ArrayList<>();
        Fahrzeug auto1 = new Fahrzeug("VW");
        Fahrzeug auto2 = new Fahrzeug("BMW");
        eineListeVonFahrzeugen.add(auto1);
        eineListeVonFahrzeugen.add(auto2);
        System.out.println(eineListeVonFahrzeugen);

        // klassische For-Schleife
        for (int i = 0; i < eineListeVonFahrzeugen.size(); i++) {
            Fahrzeug aktuellesFahrzeug = eineListeVonFahrzeugen.get(i);
            System.out.println(aktuellesFahrzeug.getMarke());
        }

        // dies ist aber viel zu kompliziert, daher viel einfacher
        for (Fahrzeug aktuellesFahrzeug : eineListeVonFahrzeugen) {
            System.out.println(aktuellesFahrzeug.getMarke());
        }

        // Während man über eine Liste itereriert, darf die Liste nicht verändert werden
        for (Fahrzeug f : eineListeVonFahrzeugen) {
            //eineListeVonFahrzeugen.add(new Fahrzeug("Opel"));
            System.out.println(f.getMarke());
        }

    }

}
