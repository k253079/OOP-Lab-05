class Account {
    int accountNumber;
    double balance;

    static int totalAccounts = 0;
    static double totalBankBalance = 0;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
        totalBankBalance = totalBankBalance + balance;
    }

    static void bankSummary() {
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Total Bank Balance: " + totalBankBalance);
    }
}

public class Bank {

    public static void main(String[] args) {

        Account a1 = new Account(1001, 5000.0);
        Account a2 = new Account(1002, 12000.0);
        Account a3 = new Account(1003, 8500.0);
        Account a4 = new Account(1004, 3200.0);
        Account a5 = new Account(1005, 15000.0);

        System.out.println("Branch 1 Accounts:");
        System.out.println("Account " + a1.accountNumber + " - Balance: " + a1.balance);
        System.out.println("Account " + a2.accountNumber + " - Balance: " + a2.balance);

        System.out.println();
        System.out.println("Branch 2 Accounts:");
        System.out.println("Account " + a3.accountNumber + " - Balance: " + a3.balance);
        System.out.println("Account " + a4.accountNumber + " - Balance: " + a4.balance);
        System.out.println("Account " + a5.accountNumber + " - Balance: " + a5.balance);

        System.out.println();
        System.out.println("--- Bank Summary ---");
        Account.bankSummary();

    }
}
