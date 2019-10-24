package at.htl.sportplatzverwaltung.boundary;


import at.htl.sportplatzverwaltung.entity.Spielfeld;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("sportplatzvermietung")
public class SportplatzvermietungEndpoint {

    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init(){
        System.out.println("SportplatzvermietungEndpoint created");
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Spielfeld spielfeld(@PathParam("id") long id){
        return em.find(Spielfeld.class, id);
    }
}
