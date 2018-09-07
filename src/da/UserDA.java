package da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDA implements IUserDA {

	private Connection conn;

	public UserDA() {
		conn = DBUtil.getConnection();
	}

	@Override
	public void addUser(User user) {
		try {
			String query = "insert into ppc.users (usUser, usPw, usFirstName, usLastName, usEmail, usPhone, usQs, usAns) "
					+ "values (? , ? , ?, ? , ? , ? , ? , ? )";

			PreparedStatement preparedStatement = conn.prepareStatement(query);

//			preparedStatement.setInt(1, user.getId());
			preparedStatement.setString(1, user.getUser());
			preparedStatement.setString(2, user.getPw());
			preparedStatement.setString(3, user.getFrName());
			preparedStatement.setString(4, user.getLastName());
			preparedStatement.setString(5, user.getEmail());
			preparedStatement.setString(6, user.getPhone());
			preparedStatement.setString(7, user.getQs());
			preparedStatement.setString(8, user.getAns());
//			preparedStatement.setTimestamp(8,
//					new Timestamp(System.currentTimeMillis()));// user.getLast_update()
																// );, fTimeStemp
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement
					.executeQuery("SELECT * FROM ppc.users");
			while (resultSet.next()) {

				User user = new User(resultSet.getInt("usID"),
						resultSet.getString("usUser"),
						resultSet.getString("usPw"),
						resultSet.getString("usFirstName"),
						resultSet.getString("usLastName"),
						resultSet.getString("usEmail"),
						resultSet.getString("usPhone"),
						resultSet.getString("usQs"),
						resultSet.getString("usAns"),
						resultSet.getTimestamp("fTimeStemp"));

				users.add(user);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return users;
	}

	@Override
	public User getUserByID(String userID) {
		User user = new User();
		try {
			String query = "SELECT * FROM ppc.users WHERE usID=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(userID));
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user.setId(resultSet.getInt("usID"));
				user.setUser(resultSet.getString("usUser"));
				user.setPw(resultSet.getString("usPw"));
				user.setFrName(resultSet.getString("usFirstName"));
				user.setLastName(resultSet.getString("usLastName"));
				user.setEmail(resultSet.getString("usEmail"));
				user.setPhone(resultSet.getString("usPhone"));
				user.setQs(resultSet.getString("usQs"));
				user.setAns(resultSet.getString("usAns"));
				user.setLast_update(resultSet.getTimestamp("usTimeStemp"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return user;
	}

	@Override
	public void updateUser(User user) {
		try {
			String query = "update ppc.users set  usUser=?, usPw=?, usFirstName=?, usLastName=?, usEmail=?, usPhone=?, usQs=?, usAns=? ,usTimeStemp=? where usID=?";		
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			preparedStatement.setString(1, user.getUser());
			preparedStatement.setString(2, user.getPw());
			preparedStatement.setString(3, user.getFrName());
			preparedStatement.setString(4, user.getLastName());
			preparedStatement.setString(5, user.getEmail());
			preparedStatement.setString(6, user.getPhone());
			preparedStatement.setString(7, user.getQs());
			preparedStatement.setString(8, user.getAns());
			preparedStatement.setTimestamp(9,
					new Timestamp(System.currentTimeMillis()));// user.getLast_update()		
			preparedStatement.setInt(10, user.getId()); //where=?
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteUser(String userID) {
		try {
			String query = "delete from ppc.users WHERE usID=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(userID));
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
