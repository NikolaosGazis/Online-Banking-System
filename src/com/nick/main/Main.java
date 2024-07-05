// Packages //
import java.io.*;
import java.util.Scanner;

// Core //
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initiliaze Scanner for input.
        AccountManager accountManager = new AccountManager();

        // Starting Menu Options //
        System.out.println("--- Welcome to our Online Banking System! ---");
        System.out.println("1. Login\n2. Sign Up");
        System.out.println("[SYSTEM] Please Input your Option [1: Login, 2: Sign Up, 0: Exit]:");

        // Read User Input //
        int choice = scanner.nextInt();
        scanner.nextLine(); // New line.

        // Depending on the User Choice //
        switch((choice)) {
            case 1: // Login.
                System.out.println("--- Login ---");
                System.out.println("Username:");
                String username = scanner.nextLine();
                System.out.println("Password:");
                String password = scanner.nextLine();
                // pass for check up //
                break;
            case 2: // Sign Up.
                System.out.println("--- Sign Up ---");
                System.out.println("Full Name:");
                String holdersName = scanner.nextLine();
                System.out.println("Username: ");
                String suUsername = scanner.nextLine();
                System.out.println("Password:");
                String suPassword = scanner.nextLine();
                // additional info - check if user exists - create new account/card //
                break;
            case 0:
                System.out.println("Ending program...");
                break;
            default: // Anything else - must try again.
                System.out.println("Something went wrong with the input. Try again.");
                break;
        }
        // Close the Scanner - Free up Resources //
        scanner.close();
    }
}