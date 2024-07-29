package com.app.dao;

import java.sql.SQLException;

public interface BankAccountDao {
//add a method for the funds transfer
	String transferFunds(int srcId, int destId, double amount) throws SQLException;
}
