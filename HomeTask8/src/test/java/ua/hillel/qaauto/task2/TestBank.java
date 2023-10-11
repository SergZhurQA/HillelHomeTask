package ua.hillel.qaauto.task2;

import org.testng.annotations.Test;

public class TestBank {

    @Test(priority = 1)
    public void testCreateBankAndAccounts() {
        Bank bank = new Bank(4);
        bank.createAccount(12345, 10000);
        bank.createAccount(34567, 4000);
        bank.createAccount(67890, 50000);
        bank.createAccount(67890, 50000);
        bank.createAccount(67890, 50000);
    }

    @Test(priority = 2)
    public void testDepositValidData() {
        Bank bank = new Bank(1);
        bank.createAccount(32456, 10000);
        bank.deposit(32456, 100);
    }

    @Test(priority = 3)
    public void testDepositInvalidAccountNumber() {
        Bank bank = new Bank(1);
        bank.createAccount(32456, 10000);
        bank.deposit(98765, 100);
    }

    @Test(priority = 4)
    public void testDepositInvalidAmountOfMoney() {
        Bank bank = new Bank(1);
        bank.createAccount(32456, 10000);
        bank.deposit(32456, 0);
    }

    @Test(priority = 5)
    public void testWithdrawalValidData() {
        Bank bank = new Bank(1);
        bank.createAccount(32456, 10000);
        bank.withdrawal(32456, 4000);
    }

    @Test(priority = 6)
    public void testWithdrawalInvalidAccountNumber() {
        Bank bank = new Bank(1);
        bank.createAccount(32456, 10000);
        bank.withdrawal(98765, 4000);
    }

    @Test(priority = 7)
    public void testWithdrawalInvalidAmountOfMoney() {
        Bank bank = new Bank(1);
        bank.createAccount(32456, 10000);
        bank.withdrawal(32456, 12000);
        bank.withdrawal(32456, 0);
    }

    @Test
    public void testCreationAndSavingTransactionOnAccount() {
        Bank bank = new Bank(1);
        bank.createAccount(32456, 10000);
        bank.withdrawal(32456, 900);
        System.out.println(bank.accountsArray[0].getTransaction());
    }
}
