package ua.hillel.qaauto.task2;

public class Bank {
    int accountCounter = 0;
    Account[] accountsArray;

    Bank(int qtyAccount) {
        accountsArray = new Account[qtyAccount];
    }

    class Account {
        int accountNumber;
        int balance;

        public void setTransaction(Transactions transaction) {
            this.transaction = transaction;
        }

        public Transactions getTransaction() {
            return transaction;
        }

        Transactions transaction;

        public int getBalance() {
            return balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public Account(int accountNumber, int balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }

    class Transactions {
        String operationName;
        int amountOfMoney;
        int accountNumber;
        int currentBalance;

        Transactions(String operationName, int amountOfMoney, int accountNumber, int currentBalance) {
            this.operationName = operationName;
            this.amountOfMoney = amountOfMoney;
            this.accountNumber = accountNumber;
            this.currentBalance = currentBalance;
        }

        @Override
        public String toString() {
            return "Transactions: " + "\n" +
                    "operation name: " + operationName + "\n" +
                    "amount of money: " + amountOfMoney + "\n" +
                    "accountNumber: " + accountNumber + "\n" +
                    "current balance: " + currentBalance;
        }
    }

    void createAccount(int accountNumber, int startedBalance) {
        if (accountCounter == accountsArray.length) {
            System.out.println("Account " + accountNumber + " not created! The maximum quantity of accounts " + "already exists!");
        } else {
            accountsArray[accountCounter] = new Account(accountNumber, startedBalance);
            System.out.println("Account " + accountNumber + " is created. Can create " + (accountsArray.length - 1 - accountCounter) + " more accounts.");
            accountCounter++;
        }
    }

    void deposit(int accountNumber, int amountOfMoney) {
        if (amountOfMoney <= 0) {
            System.out.println("Deposit must be more than 0.");
        } else {
            for (Account account : accountsArray) {
                if (account.getAccountNumber() == accountNumber) {
                    account.setBalance(account.getBalance() + amountOfMoney);
                    account.setTransaction(new Transactions("deposit", amountOfMoney, account.getAccountNumber(), account.getBalance()));
                    System.out.println(account.getTransaction());
                    return;
                }
            }
            System.out.println("Account " + accountNumber + " does not exist. Check the entered number is correct.");
        }

    }

    void withdrawal(int accountNumber, int amountOfMoney) {
        for (Account account : accountsArray) {
            if (account.getAccountNumber() == accountNumber) {
                if (amountOfMoney <= 0 || amountOfMoney > account.getBalance()) {
                    System.out.println("The amount must be greater than zero and not exceed the account balance.");
                } else {
                    account.setBalance(account.getBalance() - amountOfMoney);
                    account.setTransaction(new Transactions("withdrawal", amountOfMoney, account.getAccountNumber(), account.getBalance()));
                    System.out.println(account.getTransaction());
                }
                return;
            }
        }
        System.out.println("Account " + accountNumber + " does not exist. Check the entered number is correct.");
    }
}

