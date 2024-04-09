package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon1 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.printf("JDBC Driver 로드 성공\n");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "ADAM";
			String pw = "1234";
			conn = DriverManager.getConnection(url, user, pw);
			System.out.printf("DB 연결 성공\n");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				System.out.printf("DB 연결 해제");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
