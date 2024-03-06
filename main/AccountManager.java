// Packages //
import java.util.ArrayList;
import java.util.List;

// Class //
public class AccountManager {
    private List<Account> accounts; // hold the stored accounts.

    // Constructor for the object list //
    public AccountManager() {
        this.accounts = new ArrayList<>();
    }

    // Save a new account to the system //
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Find an account object based on the username //
    public Account getAccountByUsername(String username) { // return an "account" object.
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) { // Account.java method.
                return account;
            }
        }
        return null; // an account was not found.
    }

    // Authenticate user (Login) //
    public boolean authenticateUser(String username, String password) {
        System.out.println("hey mom");
        return true;
    }
}