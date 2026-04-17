import java.util.Arrays;

/*
 * MAIN CLASS - UseCase19TrainConsistMgmnt
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * Demonstrates searching for a bogie ID using Binary Search
 * on sorted data (divide-and-conquer approach).
 */

public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("=====================================\n");

        // Step 1: Create array (can be unsorted initially)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort array (precondition for Binary Search)
        Arrays.sort(bogieIds);

        // Step 3: Search key
        String key = "BG309";

        // Step 4: Display sorted bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ---- BINARY SEARCH LOGIC ----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            // Compare using compareTo()
            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            }
            else if (result > 0) {
                low = mid + 1; // search right half
            }
            else {
                high = mid - 1; // search left half
            }
        }

        // Step 5: Display result
        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " NOT found.");
        }

        System.out.println("\nUC19 search completed ...");
    }
}
