import java.util.*;

public class UseCase7TrainConsistMgmnt {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("=================================\n");

        // Step 1: Create List
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Step 3: Display Before Sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // Step 4: Sort using Comparator (Lambda)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 5: Display After Sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC7 sorting completed ...");
    }
}