import java.util.Scanner;

class MSI {

    private static int LCID = 1;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            clearConsole();
            System.out.println("==============================");
            System.out.println("Welcome to <TEXAS> MIS");
            System.out.println("==============================");
            System.out.println("1. Add Information");
            System.out.println("2. Update Information");
            System.out.println("3. View Inventory");
            System.out.println("4. Delete Information");
            System.out.println("5. Transaction (if included)");
            System.out.println("6. Exit");
            System.out.println("==============================");
            System.out.print("Please enter your choice (1-6): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addInformation();
                    break;
                case 2:
                    updateInformation();
                    break;
                case 3:
                    viewInventory();
                    break;
                case 4:
                    deleteInformation();
                    break;
                case 5:
                    performTransaction();
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
            scanner.nextLine();
            scanner.nextLine();
        } while (choice != 6);
        scanner.close();
    }

    private void addInformation() {
        System.out.println("[LCID - " + LCID++ + " - Add Information]");

    }

    private void updateInformation() {
        System.out.println("[LCID - " + LCID++ + " - Update Information]");
    }

    private void viewInventory() {
        System.out.println("[LCID - " + LCID++ + " - View Inventory]");

    }

    private void deleteInformation() {
        System.out.println("[LCID - " + LCID++ + " - Delete Information]");

    }

    private void performTransaction() {
        System.out.println("[LCID - " + LCID++ + " - Perform Transaction]");

    }

    private static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}

