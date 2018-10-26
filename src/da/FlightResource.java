package da;

import java.util.List;
import javax.persistence.EntityManager;
import model2.Flight;

public class FlightResource extends ResourceBase<Flight> {
	private EntityManager em;
	private List<Flight> listFlights;

	@Override
	public void insert(Flight a) {
		em = this.getEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public List<Flight> getAll() {
		em = this.getEntityManager();
		em.getTransaction().begin();
		listFlights = em.createQuery("SELECT a FROM Flight a", Flight.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listFlights;
	}

	@Override
	public Flight getByID(int id) {
		em = this.getEntityManager();
		em.getTransaction().begin();
		Flight flight = em.find(Flight.class, id);
		em.getTransaction().commit();
		em.close();
		return flight;
	}

	@Override
	public void update(Flight a) {
		em = this.getEntityManager();
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void delete(int id) {
		em = this.getEntityManager();
		em.getTransaction().begin();
		Flight flight = em.find(Flight.class, id);
		em.remove(flight);
		em.getTransaction().commit();
		em.close();

	}

}
