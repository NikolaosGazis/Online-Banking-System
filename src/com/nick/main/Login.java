// Core // 
public class Login {
    private AccountManager accountManager;

    // Constructor //
    public Login(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    // User Login //
    public boolean login(String username, String password) {
        return accountManager.authenticateUser(username, password);
    }
}