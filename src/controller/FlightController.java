package controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import da.FlightResource;
import model2.Flight;

/**
 * Servlet implementation class FlightController
 */
@WebServlet("/FlightController")
public class FlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private static final String LIST_ACTORS="/flight.jsp";

	private static final String FORM_STUDENT = "/formflight.jsp";
	
	private FlightResource flightResourse ;


	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightController() {
        super();
        flightResourse = new FlightResource();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String action=request.getParameter("myaction");
	 String forward="";
		
		if(action.equalsIgnoreCase("listOfFlights"))
		{
			forward=LIST_ACTORS;
			List<Flight> list=flightResourse.getAll();
			request.setAttribute("actorim", list);
		}
		
		else if(action.equalsIgnoreCase("delete"))
		{
			forward=LIST_ACTORS;
			String flightID=request.getParameter("id");
			
			flightResourse.delete(Integer.parseInt(flightID));
			List<Flight> list=flightResourse.getAll();
			
			request.setAttribute("actorim", list);
		}
		else if(action.equalsIgnoreCase("update"))
		{
		  forward=FORM_STUDENT;
		  String flightID=request.getParameter("id");
		  Flight flight=flightResourse.getByID(Integer.parseInt(flightID));
		  request.setAttribute("sahkan", flight);
		  
		}
	 RequestDispatcher dispatcher=request.getRequestDispatcher(forward);
	 dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        request.setCharacterEncoding("UTF-8");
		
		String id=request.getParameter("id_param");
		String f_name=request.getParameter("f_name_param");
		String l_name=request.getParameter("l_name_param");
		String last_update=request.getParameter("update_param");

		Flight flight=flightResourse.getByID(Integer.parseInt(id));
		
		//ToDo - update the filed to update from the jsp:
//		flight.set(f_name);
//        flight.setLastName(l_name);
//        flight.setLastUpdate(Timestamp.valueOf(last_update));
//        flightResourse.update(flight);
        List<Flight> list=flightResourse.getAll();
		request.setAttribute("actorim", list);
		RequestDispatcher dispatcher=request.getRequestDispatcher(LIST_ACTORS);
		dispatcher.forward(request, response);

	}

}
