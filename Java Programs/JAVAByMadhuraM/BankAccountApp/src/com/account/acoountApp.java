package com.account;

import java.io.IOException;

public class acoountApp {
    public static void main(String[] args) {
        try {
            BankStatementTester tester = new BankStatementTester("Jan2023.txt");
            tester.displayResults();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
