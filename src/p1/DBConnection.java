package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection { // �������ݿ⣬�����ݿ���в���

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;

	public DBConnection() { // ���췽��

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// connect =
			// DriverManager.getConnection("jdbc:mysql://520-081:3306/student",
			// "root", "root"); //
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=root&useUnicode=true&characterEncoding=utf8");
			statement = connect.createStatement();
			System.out.println("db connection ok!");

		} catch (SQLException e) {
			// System.out.println("MySQL Error");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet executeQuery(String strSQL) {
		ResultSet resultSet = null;
		try {
			// System.out.println(strSQL);
			if (statement == null) {
				System.out.println("statement is null!!");
			} else
				resultSet = statement.executeQuery(strSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}

	public boolean execute(String strSQL) {
		try {
			System.out.println(strSQL);
			int row = statement.executeUpdate(strSQL);
			System.out.println("row=" + row);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public void close() {
		try {
			if (statement != null) {
				statement.close();
			}
			if (connect != null) {
				connect.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {

		DBConnection b = new DBConnection();
		
		b.execute("insert users(score) values(12)");
		
//		ResultSet rs = b.executeQuery("select * from qusetions where id = '2'");
//
//		while (rs.next()) {
//			System.out.println(rs.getString(3));
//		}
//		b.close();
	}

}
