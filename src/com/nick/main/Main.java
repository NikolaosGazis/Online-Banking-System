// Packages //
import java.util.Scanner;

// Core //
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initiliaze Scanner for input.
        AccountManager accountManager = new AccountManager();
        Login login = new Login(accountManager);

        while (true) {
            // Starting Menu Options //
            System.out.println("--- Welcome to our Online Banking System! ---");
            System.out.println("0. Exit\n1. Login\n2. Sign Up");
            System.out.println("[SYSTEM] Please input your Option -> ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // New line.

            // Depending on the User Choice //
            switch((choice)) {
                case 1: // Login.
                    System.out.println("--- Login ---");
                    System.out.println("[SYSTEM] Username:");
                    String username = scanner.nextLine();
                    System.out.println("[SYSTEM] Password:");
                    String password = scanner.nextLine();
                    
                    if (login.login(username, password)) {
                        System.out.println("[SYSTEM] Login success!");
                        // Actions once logged in //
                    } else {
                        System.out.println("[SYSTEM] Invalid credentials, try again.");
                    }

                    break;
                case 2: // Sign Up.
                    System.out.println("--- Sign Up ---");
                    System.out.println("[SYSTEM] Username:");
                    String suUsername = scanner.nextLine();
                    System.out.println("[SYSTEM] Password:"); // Make display *.
                    String suPassword = scanner.nextLine();
                    System.out.println("[SYSTEM] Initial Deposit:");
                    Double suDeposit = scanner.nextDouble(); // Make a question.
                    scanner.nextLine();

                    // Save the Credentials //
                    Account newAccount = new Account();
                    newAccount.setUsername(suUsername);
                    newAccount.setPassword(suPassword);
                    newAccount.setBalance(suDeposit);

                    accountManager.addAccount(newAccount);
                    System.out.println("[SYSTEM] You account has been created!");

                    break;
                case 0:
                    System.out.println("[SYSTEM] Closing system...");
                    scanner.close(); // Free up resources.
                    System.exit(0);
                default: // Anything else - must try again.
                    System.out.println("Something went wrong with the input. Try again.");
                    break;
            }
        }
    }
}