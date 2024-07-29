package com.account;
class Transaction {
    String date;
    String narration;
    double withdrawalAmount;
    double depositAmount;

    Transaction(String line) {
        String[] fields = line.split(",");
        this.date = fields[0];
        this.narration = fields[1];
        this.withdrawalAmount = Double.parseDouble(fields[2]);
        this.depositAmount = Double.parseDouble(fields[3]);
    }

    double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    double getDepositAmount() {
        return depositAmount;
    }
}
