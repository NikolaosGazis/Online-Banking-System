// Packages //
import java.util.ArrayList;
import java.util.List;

// Core //
public class SignUp {
    public static Account createAccount(String username, String password, double balance) {
        // Create new Account (object) with the given information //
        Account newAccount = new Account();
        newAccount.setUsername(username);
        newAccount.setPassword(password);
        newAccount.setBalance(balance);
        return newAccount;
    }
}