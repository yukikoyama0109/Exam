package dao;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
//	全てのインスタンスで利用する
	static DataSource ds;

	public Connection getConnection() throws Exception {
		if (ds==null) {
			InitialContext ic = new InitialContext();
			ds = (DataSource)ic.lookup("java:/comp/env/jdbc/book");
		}
		return ds.getConnection();
	}


}

