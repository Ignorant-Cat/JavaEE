package azy.operation;

import java.sql.SQLException;

import azy.table.User;

public class Test {
	public static void main(String[] argc) throws SQLException {
		UserOp uop = new UserOp();
		PersonOp pop = new PersonOp();
		System.out.println(uop.selUserByName("111"));
		
	}

}
