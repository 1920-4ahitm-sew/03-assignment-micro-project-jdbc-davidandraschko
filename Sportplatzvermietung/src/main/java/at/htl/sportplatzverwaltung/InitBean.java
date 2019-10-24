package at.htl.sportplatzverwaltung;

import at.htl.sportplatzverwaltung.entity.Spielfeld;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Destroyed;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class InitBean {

    @PersistenceContext
    EntityManager em;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init){
        System.out.println("*** It works ***");

        em.persist(new Spielfeld(120, 90));
        em.persist(new Spielfeld(100, 80));
        em.persist(new Spielfeld(90, 45));
    }

    public void tearDown(@Observes @Destroyed(ApplicationScoped.class) Object init){
        //when app is undeployed
    }


}
