package tutorial;

import java.util.Arrays;
import java.util.List;

public class T5_ListenUndArrays {

    public static void main(String[] args) {

        // Häufig stösst man auf Arrays, möchte aber lieber Listen haben, und umgekehrt
        String[] stringArray = new String[2];
        stringArray[0] = "Hello";
        stringArray[1] = "World";
        System.out.println(stringArray[0]);

        // Java bietet ein Werkzeug zum konvertieren
        List<String> stringList = Arrays.asList(stringArray);
        System.out.println(stringList.get(0));

        // Oder anderes rum
        String[] anderesArray = stringList.toArray(new String[stringList.size()]);
        System.out.println(anderesArray[0]);

    }

}
