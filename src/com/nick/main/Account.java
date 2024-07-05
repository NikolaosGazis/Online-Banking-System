// Packages //
// import java.util.ArrayList;
// import java.util.List;

// Core //
public class Account { // Information about every account.
    private long accountNumber;
    private String username;
    private double balance;
    // private List<String> transactionHistory = new ArrayList<>(); // Hold transaction history of each account.

    // Getter - accountNumber //
    public long getAccountNumber() {
        return this.accountNumber;
    }

    // Setter - accountNumber //
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter - username //
    public String getUsername() { 
        return this.username;
    }

    // Setter - username //
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter - balance //
    public double getBalance() {
        return this.balance;
    }

    // Setter - balance //
    public void setBalance(double balance) {
        this.balance = balance;
    }
}