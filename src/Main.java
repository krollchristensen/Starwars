import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Opret objekter
        Jedi luke = new Jedi("Luke Skywalker", "Human");
        Sith vader = new Sith("Darth Vader", "Human");
        Jedi yoda = new Jedi("Yoda", "Unknown");

        // Opret et array af Character objekter
        Character[] characterArray = new Character[2];
        characterArray[0] = luke;  // Gem Jedi i array
        characterArray[1] = vader; // Gem Sith i array

        // Iterér gennem arrayet og kald deres metoder
        System.out.println("Using array:");
        for (Character character : characterArray) {
            character.attack();  // Kalder den overridede attack metode
            character.defend();  // Kalder den overridede defend metode

            // Hvis karakteren er en Jedi, kan vi bruge attackWithForce metoden
            if (character instanceof Jedi) {
                ((Jedi) character).attackWithForce();
            }

            // Hvis karakteren er en Sith, kan vi bruge attackWithForceLightning metoden
            if (character instanceof Sith) {
                ((Sith) character).attackWithForceLightning();
            }
        }

        // Opret en ArrayList af Character objekter
        ArrayList<Character> characterList = new ArrayList<>();
        characterList.add(luke);   // Tilføj Jedi til ArrayList
        characterList.add(vader);  // Tilføj Sith til ArrayList
        characterList.add(yoda);   // Tilføj endnu en Jedi til ArrayList

        // Iterér gennem ArrayList og kald deres metoder
        System.out.println("\nUsing ArrayList:");
        for (Character character : characterList) {
            character.attack();  // Kalder den overridede attack metode
            character.defend();  // Kalder den overridede defend metode

            // Hvis karakteren er en Jedi, kan vi bruge attackWithForce metoden
            if (character instanceof Jedi) {
                ((Jedi) character).attackWithForce();
            }

            // Hvis karakteren er en Sith, kan vi bruge attackWithForceLightning metoden
            if (character instanceof Sith) {
                ((Sith) character).attackWithForceLightning();
            }
        }
    }
}
