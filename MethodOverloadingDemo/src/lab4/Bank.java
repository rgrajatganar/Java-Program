package lab4;


class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount);
        }
    }
}

class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 1000;

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance && amount <= WITHDRAWAL_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Withdrawal limit exceeded or insufficient funds. Cannot withdraw $" + amount);
        }
    }
}

class CheckingAccount extends BankAccount {
    private static final double WITHDRAWAL_FEE = 2.5;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= (amount + WITHDRAWAL_FEE);
            System.out.println("Withdrawn $" + amount + " with a fee of $" + WITHDRAWAL_FEE + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1500);
        CheckingAccount checkingAccount = new CheckingAccount(2000);

        savingsAccount.withdraw(500);
        savingsAccount.withdraw(1500);

        checkingAccount.withdraw(100);
        checkingAccount.withdraw(500);
    }
}

