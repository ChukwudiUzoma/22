package introsde.rest.adapters;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("introsde")//Identifies the application path that serves as the base URI for all resource URIs provided by Path
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("introsde.rest.adapters");// Jersey will load all the resources under this package

    }
}
