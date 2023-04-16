package com.advj.utils;

import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBUtil {

	public static void main(String[] args) {
		DBUtil.getMySQLConnection();
	}

	public static Connection getMySQLConnection() {
		Connection con = null;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/UsersDB");
			con = ds.getConnection();
			System.out.println("DB Connected !");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error while connecting DATABASE");
		}
		return con;
	}

	public static void cleanup(Connection con, Statement st, ResultSet rs) {
		try {
			// 7.Release the Resources
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void cleanup(Connection con, Statement st) {
		try {
			// 7.Release the Resources
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}