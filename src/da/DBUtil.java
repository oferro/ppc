package da;

import java.sql.*;
import java.util.TimeZone;

//���� �� ������ - ������ ��� �� ������
public class DBUtil {
	// ����� �� ����� ������ ������� ������, ������ ����
	private static Connection conn;

	// ��� �� ����� ������
	public static Connection getConnection() {

		// �� ���� ��� ���� �� ����� ���� �����
		if (conn != null)
			return conn;

		// �� �� ���� ��� � �������
		// ���� ������

		String url = "jdbc:mysql://localhost:3306/ppc?useLegacyDatetimeCode=false&serverTimezone=Asia/Jerusalem&useSSL=false";
		String username = "root";
		String password = "9945629";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, username, password);
		}

		catch (java.sql.SQLException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(TimeZone.getDefault());
		// String url =
		// "jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=Asia/Jerusalem&useSSL=false";

		return conn;
	}

	// ���� ������ ��� ������ ������
	public static void closeConnection(Connection toBeClosed) {
		if (toBeClosed == null)
			return;

		try {
			toBeClosed.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
