public class UseCase16TrainConsistMgmnt {

    // ---- Passenger Bogie Model ----
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        void display() {
            System.out.println(type + " -> Capacity: " + capacity);
        }
    }

    // ---- Bubble Sort Logic ----
    static void sortBogies(PassengerBogie[] bogies) {

        int n = bogies.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent bogies
                if (bogies[j].capacity > bogies[j + 1].capacity) {

                    // Swap
                    PassengerBogie temp = bogies[j];
                    bogies[j] = bogies[j + 1];
                    bogies[j + 1] = temp;
                }
            }
        }
    }

    // ---- Display Method ----
    static void displayBogies(PassengerBogie[] bogies) {
        for (PassengerBogie b : bogies) {
            b.display();
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC16 - Sort Passenger Bogies ");
        System.out.println("=====================================\n");

        PassengerBogie[] bogies = {
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 60),
                new PassengerBogie("First Class", 30),
                new PassengerBogie("Second Sitting", 90)
        };

        System.out.println("Before Sorting:");
        displayBogies(bogies);

        // Apply Bubble Sort
        sortBogies(bogies);

        System.out.println("\nAfter Sorting (Ascending by Capacity):");
        displayBogies(bogies);

        System.out.println("\nUC16 sorting completed ...");
    }
}