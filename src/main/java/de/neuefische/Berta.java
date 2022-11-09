package de.neuefische;

import java.io.IOException;

public class Berta {
    public static String order() throws IOException {
        System.out.println("Berta: I am getting a sandwich from Caesar");
        String meal = Caesar.bake();
        System.out.println("Berta: I am returning a sandwich...");
        return meal;
    }

}
