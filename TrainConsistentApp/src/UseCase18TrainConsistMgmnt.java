/*
 * MAIN CLASS - UseCase18TrainConsistMgmnt
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * Demonstrates searching for a specific bogie ID
 * using Linear Search (sequential traversal).
 */

public class UseCase18TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("=====================================\n");

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "B6309", "B6412", "BG550"};

        // Step 2: Search key
        String searchId = "B6309";

        // Step 3: Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ---- LINEAR SEARCH LOGIC ----
        boolean found = false;

        for (String id : bogieIds) {

            // Compare using equals()
            if (id.equals(searchId)) {
                found = true;
                break; // stop immediately when found
            }
        }

        // Step 4: Display result
        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " NOT found in train consist.");
        }

        System.out.println("\nUC18 search completed ...");
    }
}