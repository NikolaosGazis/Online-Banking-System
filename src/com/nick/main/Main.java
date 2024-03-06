// Packages //
import java.io.*;
import java.util.Scanner;

// Variables //
String username;

// Main //
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();

        // Starting Menu options //
        System.out.println("--- Welcome to our Online Banking System! ---");
        System.out.println("1. Login\n2. Sign Up");
        System.out.println("[SYSTEM] Please choose an option:");

        // Read User Input //
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume new line.

        // Depending on the user choice //
        switch((choice)) {
            case 1: // Login.
                System.out.println("--- Login ---");
                System.out.println("Username:");
                String username = scanner.nextLine();
                System.out.println("Password:");
                String password = scanner.nextLine();
                // pass for check up //
                break;
        
            case 2:
                System.out.println("--- Sign Up ---");
                System.out.println("Full Name:");
                String holdersName = scanner.nextLine();
                System.out.println("Username: ");
                String suUsername = scanner.nextLine();
                System.out.println("Password:");
                String suPassword = scanner.nextLine();
                // additional info - check if user exists - create new account/card //
                break;

            default:
                System.out.println("Something went wrong with the input. Try again.");
                break;
        }

        // Close the Scanner - free up resources //
        scanner.close();
    }
}