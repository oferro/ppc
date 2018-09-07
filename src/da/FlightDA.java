package da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import model.Flight;

public class FlightDA implements IFlightDA {

	private Connection conn;

	public FlightDA() {
		conn = DBUtil.getConnection();
	}

	@Override
	public void addFlight(Flight flight) {
		try {
			String query = "insert into ppc.flights (flPPC, fUser, fDate, fToHour, fLndHour, fAirField, fFltRoute) "
					+ "values (? , ? , ?, ? , ? , ? , ? )";

			PreparedStatement preparedStatement = conn.prepareStatement(query);

			preparedStatement.setInt(1, flight.getPpcId());
			preparedStatement.setInt(2, flight.getUserId());
			preparedStatement.setString(3, flight.getDate());
			preparedStatement.setString(4, flight.getToHour());
			preparedStatement.setString(5, flight.getLndHour());
			preparedStatement.setString(6, flight.getAirField());
			preparedStatement.setString(7, flight.getFltRoute());
//			preparedStatement.setTimestamp(8,
//					new Timestamp(System.currentTimeMillis()));// flight.getLast_update()
																// );, fTimeStemp
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public List<Flight> getAllFlights() {
		List<Flight> flights = new ArrayList<Flight>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement
					.executeQuery("SELECT * FROM ppc.flights");
			while (resultSet.next()) {

				Flight flight = new Flight(resultSet.getInt("fID"),
						resultSet.getInt("flPPC"),
						resultSet.getInt("fUser"),
						resultSet.getString("fDate"),
						resultSet.getString("fToHour"),
						resultSet.getString("fLndHour"),
						resultSet.getString("fAirField"),
						resultSet.getString("fFltRoute"),
						resultSet.getTimestamp("fTimeStemp"));

				flights.add(flight);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return flights;
	}

	@Override
	public Flight getFlightByID(String flightID) {
		Flight flight = new Flight();
		try {
			String query = "SELECT * FROM ppc.flights WHERE fID=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(flightID));
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				flight.setId(resultSet.getInt("fID"));
				flight.setPpcId(resultSet.getInt("flPPC"));
				flight.setUserId(resultSet.getInt("fUser"));
				flight.setDate(resultSet.getString("fDate"));
				flight.setToHour(resultSet.getString("fToHour"));
				flight.setLndHour(resultSet.getString("fLndHour"));
				flight.setAirField(resultSet.getString("fAirField"));
				flight.setFltRoute(resultSet.getString("fFltRoute"));
				flight.setLast_update(resultSet.getTimestamp("fTimeStemp"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return flight;
	}

	@Override
	public void updateFlight(Flight flight) {
		try {
			String query = "update ppc.flights set  flPPC=?, fUser=?, fDate=?, fToHour=?, fLndHour=?, fAirField=?, fFltRoute=?, fTimeStemp=? where fID=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);

			preparedStatement.setInt(1, flight.getPpcId());
			preparedStatement.setInt(2, flight.getUserId());
			preparedStatement.setString(3, flight.getDate());
			preparedStatement.setString(4, flight.getToHour());
			preparedStatement.setString(5, flight.getLndHour());
			preparedStatement.setString(6, flight.getAirField());
			preparedStatement.setString(7, flight.getFltRoute());
			preparedStatement.setTimestamp(8,
					new Timestamp(System.currentTimeMillis()));// flight.getLast_update()
																// );
			preparedStatement.setInt(9, flight.getId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteFlight(String flightID) {
		try {
			String query = "delete from ppc.flights WHERE fID=?";
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(flightID));
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
