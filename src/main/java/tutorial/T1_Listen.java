package tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T1_Listen {

    public static void main(String[] args) {

        // Listen in Java sind alle Klassen, die "List" implementieren.
        // Eine Liste hat eine Sortierung. Die Einträge liegen in der Reihenfolge vor
        // in der sie hinzugefügt werden.

        // Listen sind in Programmen überall, weil man meistens mit "Datensätzen gleicher Art" arbeitet - Datenbanken.
        

        // Der am meisten benutzte Listentyp ist die "ArrayList"
        // Eine Liste kann alles enthalten, inkl. null und Duplikaten

        ArrayList eineListe = new ArrayList();

        // mit add() werden Einträge hinzugefügt
        eineListe.add(1);
        eineListe.add("test");
        eineListe.add(1);
        eineListe.add(T1_Listen.class);
        System.out.println(eineListe);

        // Anzahl Werte einer Liste
        System.out.println(eineListe.size());

        // Mit remove kann man Einträge entfernen
        eineListe.remove(1); // "test"
        System.out.println(eineListe);

        // Mit get(x) bekommt man den Eintrag an Stelle x
        System.out.println(eineListe.get(2));

        // mit set(x, wert) kann man einen Wert an der Stelle x ersetzen
        eineListe.set(0, 13);

        // ArrayList implementiert (erfüllt die Bedingung) das Interface "List"
        List zweiteVariable = eineListe;

        // Mit contains() kann man fragen, ob ein Wert enthalten ist
        System.out.println(eineListe.contains("test"));

        // mit folgendem Aufruf erhält man eine Liste die nicht mehr änderbar ist.
        // Alle Einträge sind sozusagen "final"
        List dritteVariable = Collections.unmodifiableList(eineListe);

        // schlägt fehl
        //dritteVariable.add(2);

        // Man kann auch eine ganze Liste zu einer anderen hinzufügen - addAll();
        ArrayList weitereListe = new ArrayList();
        weitereListe.add(45);
        weitereListe.add("Hello");
        eineListe.addAll(weitereListe);

        System.out.println(eineListe);

        //Mit clear() wird eine Liste geleert
        eineListe.clear();
        System.out.println(eineListe);



    }

}
