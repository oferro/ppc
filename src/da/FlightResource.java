package da;

import java.util.List;
import javax.persistence.EntityManager;
import model2.Flights;

public class FlightResource extends ResourceBase<Flights> {
	private EntityManager em;
	private List<Flights> listFlights;

	@Override
	public void insert(Flights a) {
		em = this.getEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public List<Flights> getAll() {
		em = this.getEntityManager();
		em.getTransaction().begin();
		listFlights = em.createQuery("SELECT a FROM Flights a", Flights.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listFlights;
	}

	@Override
	public Flights getByID(int id) {
		em = this.getEntityManager();
		em.getTransaction().begin();
		Flights flights = em.find(Flights.class, id);
		em.getTransaction().commit();
		em.close();
		return flights;
	}

	@Override
	public void update(Flights a) {
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
		Flights flights = em.find(Flights.class, id);
		em.remove(flights);
		em.getTransaction().commit();
		em.close();

	}

}
