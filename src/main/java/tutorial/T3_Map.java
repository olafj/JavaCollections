package tutorial;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class T3_Map {

    public static void main(String[] args) {

        // Eine Map (interface) ist eine Zuweisung/Tabelle
        // Am häufigsten verwendet man die Klasse "HashMap"
        // hinzufügen mit "put"
        HashMap eineMap = new HashMap();
        eineMap.put(1, "Hello");
        eineMap.put(2, "World");
        System.out.println(eineMap);

        // Der erste Wert wird "Key" genannt, der zweite "Value"
        System.out.println(eineMap.containsKey(1));

        // über den Key kann man auf Werte zugreifen, get(key) gibt value zurück
        System.out.println(eineMap.get(1));

        // Die HashMap kann keine doppelten Schlüssel enthalten.
        // bei bereits vorhandenem Key wird der Value überschrieben
        eineMap.put(1, "Hello2");
        System.out.println(eineMap);

        // nicht mehr änderbare Map
        Map unveraenderbareMap = Collections.unmodifiableMap(eineMap);
        // schlägt fehl
        //unveraenderbareMap.put(3, "Soso");

        // Auch Maps haben eine size()-Methode
        System.out.println(eineMap.size());

        // Auch Maps kann man leeren
        eineMap.clear();

    }
}
