package de.neuefische;

import java.io.IOException;

public class Anton {
    public static String work() throws IOException {
        System.out.println("Anton: I am hungry");
        String sandwich = Berta.order();
        System.out.println("Anton: I eat my " + sandwich);
        return null;
    }
}
