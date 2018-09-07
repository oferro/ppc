package da;

import java.util.List;

import model.Flight;

public interface IFlightDA {

	// CRUD-Create
	public void addFlight(Flight flight);

	// CRUD-Read
	public List<Flight> getAllFlights();

	public Flight getFlightByID(String flightID);

	// CRUD-Update
	public void updateFlight(Flight flight);

	// CRUD-Delete
	public void deleteFlight(String flightID);

}
