import java.util.HashMap;

public class UseCase6TrainConsistMgmnt {
    public static void main(String[] args) {

        // Step 1: Create HashMap
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 2: Add bogie-capacity pairs
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 120);
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);

        // Step 3: Display the mapping
        System.out.println("Bogie Capacity Mapping:");
        for (String bogie : bogieCapacityMap.keySet()) {
            System.out.println(bogie + " -> " + bogieCapacityMap.get(bogie));
        }
    }
}