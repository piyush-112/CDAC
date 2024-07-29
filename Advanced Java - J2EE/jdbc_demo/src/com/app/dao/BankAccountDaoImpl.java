package com.app.dao;

import java.sql.*;
import static com.app.utils.DBUtils.*;

public class BankAccountDaoImpl implements BankAccountDao {
//state 
	private Connection cn;
	private CallableStatement cst1;

	// def ctor
	public BankAccountDaoImpl() throws SQLException {
		// get cn from DButils
		cn = openConnection();
		// cst1
		cst1 = cn.prepareCall("{call transfer_funds_proc(?,?,?,?,?)}");
		// register OUT params
		cst1.registerOutParameter(4, Types.DOUBLE);
		cst1.registerOutParameter(5, Types.DOUBLE);
		System.out.println("acct dao created !");

	}

	@Override
	public String transferFunds(int srcId, int destId, double amount) throws SQLException {
		// set IN params
		cst1.setInt(1, srcId);
		cst1.setInt(2, destId);
		cst1.setDouble(3, amount);
		// execute a proc
		cst1.execute();
		// get results from CST
		return "Updated src balance " + cst1.getDouble(4) + " dest bal " + cst1.getDouble(5);
	}
	public void cleanUp() throws SQLException {
		if(cst1 != null)
			cst1.close();
		if(cn != null)
			cn.close();
		System.out.println("acct dao cleaned up...");
	}

}
