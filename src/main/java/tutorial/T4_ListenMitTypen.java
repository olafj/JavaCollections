package tutorial;

import hilfklassen.Fahrzeug;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class T4_ListenMitTypen {

    public static void main(String[] args) {

        // Listen oder Maps bei denen die Werte alle möglichen Typen haben können,
        // sind nicht gewünscht. Daher kann man über den sogenannten Typ-Parameter
        // festlegen, von welchem Typ die Werte sind.
        ArrayList<String> eineStringListe = new ArrayList<String>(); // kann auch so geschrieben werden: new ArrayList<>()
        // zu so einer Liste können nur Werte vom Typ "String" hinzugefügt werden.
        eineStringListe.add("Hello");
        eineStringListe.add("World");
        System.out.println(eineStringListe);

        // Sowas geht dann nicht, wird gleich "rot"
        //eineStringListe.add(1);

        // Es kann auch jeder andere Typ sein
        ArrayList<Integer> eineZahlenListe = new ArrayList<>();
        eineZahlenListe.add(1);
        eineZahlenListe.add(2);


        // Auch eigene Klassen gehen als Typen
        ArrayList<Fahrzeug> eineListeVonFahrzeugen = new ArrayList<>();
        Fahrzeug auto1 = new Fahrzeug("VW");
        Fahrzeug auto2 = new Fahrzeug("BMW");
        eineListeVonFahrzeugen.add(auto1);
        eineListeVonFahrzeugen.add(auto2);
        System.out.println(eineListeVonFahrzeugen);


        // Für Maps gilt das gleiche
        HashMap<Integer, String> eineTypisierteMap = new HashMap<>();
        eineTypisierteMap.put(1, "Hello");
        // geht nicht
        //eineTypisierteMap.put(1.0, 24);



    }
}
