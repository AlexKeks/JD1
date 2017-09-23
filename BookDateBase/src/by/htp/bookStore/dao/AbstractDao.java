package by.htp.bookStore.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDao {

	protected void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void closeConnetion(Connection cn){
		if (cn != null) {
			try {
				cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
