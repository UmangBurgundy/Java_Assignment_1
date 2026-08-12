public class Encapsulation {
    static class BankAccount {
        private String accNumber;
        private double balance;

        public BankAccount(String accNumber, double balance) {
            this.accNumber = accNumber;
            this.balance = Math.max(0, balance);
        }

        public String getAccNumber() { return accNumber; }
        public double getBalance() { return balance; }

        public void deposit(double amount) {
            if (amount > 0) balance += amount;
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC101", 5000);
        acc.deposit(1500);
        acc.withdraw(2000);
        System.out.println("Account: " + acc.getAccNumber() + ", Balance: $" + acc.getBalance());
    }
}
