package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Flight;
import da.FlightDA;
import da.IFlightDA;

/**
 * Servlet implementation class ActorController
 */
@WebServlet("/FlightController")
public class FlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String LIST_FLIGHTS = "/index.jsp";
	private static final String FORM_FLIGHT = "/formflight.jsp";
	private static final String ADD_FLIGHT = "/addflight.jsp";

	private IFlightDA myFlightDA;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FlightController() {
		super();
		myFlightDA = new FlightDA();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("myaction");
		String forward = "";

		if (action.equalsIgnoreCase("listOfFlights")) {

			forward = LIST_FLIGHTS;
			List<Flight> list = myFlightDA.getAllFlights();
			request.setAttribute("tisot", list);
		}

		else if (action.equalsIgnoreCase("delete")) {
			forward = LIST_FLIGHTS;
			String flightID = request.getParameter("id");
			myFlightDA.deleteFlight(flightID);
			List<Flight> list = myFlightDA.getAllFlights();
			request.setAttribute("tisot", list);
		} else if (action.equalsIgnoreCase("update")) {
			forward = FORM_FLIGHT; // "/formflight.jsp";

			String flightID = request.getParameter("id");
			Flight flight = myFlightDA.getFlightByID(flightID);
			request.setAttribute("tisa", flight);

		} else if (action.equalsIgnoreCase("add")) {
			forward = ADD_FLIGHT; // "/addflight.jsp";

			Flight flight = null;
			request.setAttribute("tisa", flight);

		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String action = request.getParameter("myaction");
		//String forward = "";

		String id = request.getParameter("id_param");
		String ppc_Id = request.getParameter("ppcId_param");
		String user_Id = request.getParameter("userId_param");
		String date = request.getParameter("date_param");
		String to_Hour = request.getParameter("toHour_param");
		String lnd_Hour = request.getParameter("lndHour_param");
		// String passenger = request.getParameter("passenger_param");
		String air_Field = request.getParameter("airField_param");
		String flt_Route = request.getParameter("fltRoute_param");
		// String engHourStart = request.getParameter("engHourStart_param");
		// String engHourEnd = request.getParameter("engHourEnd_param");
		// String fuelQt = request.getParameter("fuelQt_param");
		// String oilQt = request.getParameter("oilQt_param");
		// String otrExp = request.getParameter("otrExp_param");
		// String mainten = request.getParameter("mainten_param");
		// String remarks = request.getParameter("remarks_param");
		String last_update = request.getParameter("update_param");
		Flight flight = new Flight();

		if (action.equalsIgnoreCase("update")) {
			flight.setId(Integer.parseInt(id));
			flight.setPpcId(Integer.parseInt(ppc_Id));
			flight.setUserId(Integer.parseInt(user_Id));
			flight.setDate(date);
			flight.setToHour(to_Hour);
			flight.setLndHour(lnd_Hour);
			flight.setAirField(air_Field);
			flight.setFltRoute(flt_Route);
			// flight.setLast_update(update_param);
			myFlightDA.updateFlight(flight);

		} else if (action.equalsIgnoreCase("add")) {
			if (!(ppc_Id == "" || user_Id =="")){
			flight.setPpcId(Integer.parseInt(ppc_Id));
			flight.setUserId(Integer.parseInt(user_Id));
			flight.setDate(date);
			flight.setToHour(to_Hour);
			flight.setLndHour(lnd_Hour);
			flight.setAirField(air_Field);
			flight.setFltRoute(flt_Route);
			myFlightDA.addFlight(flight);
			} else {
				System.out.println("No data. Going to List of flights");
			}
		}

		// דומה למה שכבר עשינו ב דו גת

		List<Flight> list = myFlightDA.getAllFlights();
		request.setAttribute("tisot", list);

		RequestDispatcher dispatcher = request
				.getRequestDispatcher(LIST_FLIGHTS);
		dispatcher.forward(request, response);

	}

}
