// Packages //
import java.util.ArrayList;
import java.util.List;

// Core //
public class AccountManager {
    private List<Account> accounts; // Hold the Stored Accounts.

    // Constructor //
    public AccountManager() {
        this.accounts = new ArrayList<>();
    }

    // Save the new Account //
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Find an Account based on the Username //
    public Account getAccountByUsername(String username) { // Return account.
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) { // Account.java method.
                return account;
            }
        }
        return null; // Account not found.
    }

    // Authenticate User (Login) //
    public boolean authenticateUser(String username, String password) {
        System.out.println("hey mom");
        return true;
    }
}