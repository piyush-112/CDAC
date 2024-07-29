package com.account;

import java.io.IOException; 
import java.util.List;

class BankStatementTester {
    private List<Transaction> transactions;
    private BankStatementUtils utils;

    BankStatementTester(String fileName) throws IOException {
        transactions = BankStatementUtils.readTransactionsFromFile("Jan2023.txt");
        utils = new BankStatementUtils(transactions);
    }

    void displayResults() {
        System.out.println("Sum of all deposits = " + utils.getSumOfDeposits());
        System.out.println("Max deposit amount = " + utils.getMaxDepositAmount());
        System.out.println("Shopping expenses = " + utils.getShoppingExpenses());
        System.out.println("Date on which max amount withdrawn = " + utils.getDateOfMaxWithdrawal());
    }
}