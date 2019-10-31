package at.htl.Sportplatzvermietung;

import at.htl.sportplatzvermietungee.entity.Spielfeld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class SportplatzvermietungTest {

    static EntityManager em;

    @BeforeAll
    private static void init(){
        em = Persistence.createEntityManagerFactory("myPU").createEntityManager();
    }

    @Test
    public void testSportplatzvermietung(){
        TypedQuery<Spielfeld> query = em.createNamedQuery("GetAll", Spielfeld.class).setParameter(1,1);
        Spielfeld spielfeld = query.getSingleResult();
        assertThat(spielfeld.getBreite(), is(90));
        assertThat(spielfeld.getLaenge(), is(120));
    }

}
