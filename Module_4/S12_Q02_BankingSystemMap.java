import java.util.HashMap;
import java.util.Map;

public class S12_Q02_BankingSystemMap {
    private Map<Integer, Double> accounts = new HashMap<>();

    public void createAccount(int customerId, double initialDeposit) {
        if (!accounts.containsKey(customerId)) {
            accounts.put(customerId, initialDeposit);
            System.out.println("Account created for ID " + customerId + " with balance: $" + initialDeposit);
        } else {
            System.out.println("Account ID " + customerId + " already exists.");
        }
    }

    public void deposit(int customerId, double amount) {
        if (accounts.containsKey(customerId)) {
            double current = accounts.get(customerId);
            accounts.put(customerId, current + amount);
            System.out.println("Deposited $" + amount + " to ID " + customerId + ". New balance: $" + accounts.get(customerId));
        } else {
            System.out.println("Account not found: " + customerId);
        }
    }

    public void withdraw(int customerId, double amount) {
        if (accounts.containsKey(customerId)) {
            double current = accounts.get(customerId);
            if (current >= amount) {
                accounts.put(customerId, current - amount);
                System.out.println("Withdrew $" + amount + " from ID " + customerId + ". New balance: $" + accounts.get(customerId));
            } else {
                System.out.println("Insufficient funds for ID " + customerId);
            }
        } else {
            System.out.println("Account not found: " + customerId);
        }
    }

    public void checkBalance(int customerId) {
        if (accounts.containsKey(customerId)) {
            System.out.println("ID " + customerId + " balance: $" + accounts.get(customerId));
        } else {
            System.out.println("Account not found: " + customerId);
        }
    }

    public static void main(String[] args) {
        S12_Q02_BankingSystemMap bank = new S12_Q02_BankingSystemMap();

        bank.createAccount(1001, 500.0);
        bank.createAccount(1002, 1000.0);

        bank.deposit(1001, 200.0);
        bank.withdraw(1001, 150.0);
        bank.withdraw(1002, 1500.0);

        bank.checkBalance(1001);
        bank.checkBalance(1002);
    }
}
