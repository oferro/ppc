package da;

import java.sql.*;
import java.util.TimeZone;

//מטרה של המחלקה - להחזיר עצם של קונקשן
public class DBUtil {
	// החרזה על משתנה קונקשן שאמורים להחזיר, המשתנה סטטי
	private static Connection conn;

	// גטר של משתנה קונקשן
	public static Connection getConnection() {

		// אם העצם כבר קיים אז תחזיר אותו וסיים
		if (conn != null)
			return conn;

		// אם לא קיים עצם ה קונקשין
		// תצור ותחזיר

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

	// שיטה שסוגרת עצם קונקשן מסויים
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
