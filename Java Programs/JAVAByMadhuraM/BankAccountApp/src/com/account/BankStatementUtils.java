package com.account;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

class BankStatementUtils {
    private List<Transaction> transactions;

    BankStatementUtils(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    static List<Transaction> readTransactionsFromFile(String fileName) throws IOException {
        return Files.lines(Paths.get(fileName))
                    .skip(1)
                    .map(Transaction::new)
                    .collect(Collectors.toList());
    }

    double getSumOfDeposits() {
        return transactions.stream()
                           .mapToDouble(Transaction::getDepositAmount)
                           .sum();
    }

    double getMaxDepositAmount() {
        return transactions.stream()
                           .mapToDouble(Transaction::getDepositAmount)
                           .max()
                           .orElse(0.0);
    }

    double getShoppingExpenses() {
        return transactions.stream()
                           .filter(t -> t.narration.contains("Shopping"))
                           .mapToDouble(Transaction::getWithdrawalAmount)
                           .sum();
    }

    String getDateOfMaxWithdrawal() {
        return transactions.stream()
                           .max((t1, t2) -> Double.compare(t1.withdrawalAmount, t2.withdrawalAmount))
                           .map(t -> t.date)
                           .orElse("N/A");
    }
}