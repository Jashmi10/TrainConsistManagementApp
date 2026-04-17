/*
 * MAIN CLASS - UseCase20TrainConsistMgmnt
 *
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description:
 * Prevents searching when no bogies exist
 * using fail-fast validation (IllegalStateException).
 */

public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("=====================================\n");

        // Step 1: Create bogie array (EMPTY TRAIN CASE)
        String[] bogieIds = {};

        // Step 2: Search key
        String searchId = "BG101";

        // ---- FAIL-FAST VALIDATION ----
        if (bogieIds.length == 0) {
            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search."
            );
        }

        // ---- SEARCH LOGIC (only runs if NOT empty) ----
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        // Step 3: Display result
        if (found) {
            System.out.println("Bogie " + searchId + " found.");
        } else {
            System.out.println("Bogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC20 execution completed ...");
    }
}