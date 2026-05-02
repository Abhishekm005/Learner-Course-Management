import java.util.Scanner;

public class AirtribeLearnerManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays to store learner data (max size 10)
        String[] names = new String[10];
        int[] ages = new int[10];
        int[] xps = new int[10];

        int count = 0; // number of learners added

        int choice;

        while (true) {
            // Menu
            System.out.println("\n===== Airtribe Learner Manager =====");
            System.out.println("1. Add Learner");
            System.out.println("2. Display All Learners");
            System.out.println("3. Calculate Average XP");
            System.out.println("4. Exit");
            System.out.print("Select: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // Add Learner
                    if (count >= 10) {
                        System.out.println("✗ Cannot add more learners. Limit reached.");
                        break;
                    }

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter XP: ");
                    int xp = sc.nextInt();

                    // Validation
                    if (age < 18 || age > 100) {
                        System.out.println("✗ Invalid age. Age must be between 18 and 100.");
                    } else {
                        names[count]= name;
                        ages[count] = age;
                        xps[count] = xp;
                      count++;
                        System.out.println("✓ Learner added successfully!");
                    }
                    break;

                case 2:
                    // Display Learners
                    if (count == 0) {
                        System.out.println("No learners added yet.");
                    } else {
                        System.out.println("--- Learner List ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + names[i] +
                                    " | Age: " + ages[i] +
                                    " | XP: " + xps[i]);
                        }
                    }
                    break;

                case 3:
                    // Calculate Average XP
                    if (count == 0) {
                        System.out.println("No learners to calculate average XP.");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < count; i++) {
                            sum += xps[i];
                        }
                        int avg = sum;
                        System.out.printf("Average XP: " + avg);
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}