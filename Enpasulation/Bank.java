class BankAccount {
    private String accountNumber;
    private String holderName;
    private int balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Cannot deposit a negative amount");
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("The banking concept for the encapsulation");

        BankAccount obj2 = new BankAccount();

        // setters se value set karo
        obj2.setAccountNumber("SBI123456");
        obj2.setHolderName("Durgesh Upadhyay");

        obj2.deposit(-100);   // invalid
        obj2.deposit(500);    // balance = 500
        obj2.withdraw(200);   // balance = 300
        obj2.withdraw(1000);  // insufficient

        // getters se value padho
        System.out.println("Account No: " + obj2.getAccountNumber());
        System.out.println("Holder Name: " + obj2.getHolderName());
        System.out.println("Balance: " + obj2.getBalance());
    }
}