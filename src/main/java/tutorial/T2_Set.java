package tutorial;

import java.util.HashSet;

public class T2_Set {

    public static void main(String[] args) {

        // Ein Set (interface) ist eine eindeutige Liste (keine Duplikate möglich) ...
        // am häufigsten verwendet man die Klasse "HashSet".

        HashSet einSet = new HashSet();
        einSet.add(1);
        einSet.add("Hello");
        System.out.println(einSet);

        // Ein HashSet erkennt Duplikate
        einSet.add("Hello");
        System.out.println(einSet);




    }

}
