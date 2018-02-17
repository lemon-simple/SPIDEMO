package com.zs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.ServiceLoader;

public class Launcher {

	public static void main(String[] args) throws Exception {
//		jdbcTest();
		showSpiPlugins();
		
	}
	private static void jdbcTest() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/test";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		Statement statement = conn.createStatement();
		ResultSet set = statement.executeQuery("select * from test.user");
		while (set.next()) {
			System.out.println(set.getLong("id"));
			System.out.println(set.getString("userName"));
			System.out.println(set.getInt("age"));
		}
	}
	private static void showSpiPlugins() {
		ServiceLoader<IOperation> operations = ServiceLoader.load(IOperation.class);
		Iterator<IOperation> operationIterator = operations.iterator();
		
		while (operationIterator.hasNext()) {
			IOperation operation = operationIterator.next();
			System.out.println(operation.operation(6, 3));
		}
	}
}