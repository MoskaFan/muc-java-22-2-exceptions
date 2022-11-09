package de.neuefische;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Caesar {

    public static String bake() throws IOException {
        String rawSandwich = "sandwich";
        String bakedSandwich = "baked" + rawSandwich;
        List<String> ingredients;
        try {
            ingredients = Files.readAllLines(Paths.get("ingredients.txt"));
        }
        catch (IOException exception){
            ingredients = List.of("ham");
        }
        String salamiSandwich = rawSandwich + " with " + ingredients.get(0);

        System.out.println("I am returning sandwich");
        return salamiSandwich;
    }
}
