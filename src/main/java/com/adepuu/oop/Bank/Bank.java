package com.adepuu.oop.Bank;

public class Bank extends com.adepuu.oop.Bank.BankAccount {
    private String bankName;
    public Bank(String accountNumber, String bankName) {
        super(accountNumber);
        this.bankName = bankName;
    }

    public String getBankName() {
        return this.bankName;
    }
    public void printAccountNumber() {
            System.out.println(super.getAccountNumber());
    }
}
