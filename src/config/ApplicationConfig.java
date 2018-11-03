package config;

import org.glassfish.jersey.server.ResourceConfig;


//@ApplicationPath("rest")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		register(controller.FlightController.class);

		register(da.FlightFacadeREST.class);

	}
}
