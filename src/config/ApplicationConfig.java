package config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		// register(FlightController.class);

		register(da.FlightFacadeREST.class);

	}
}
