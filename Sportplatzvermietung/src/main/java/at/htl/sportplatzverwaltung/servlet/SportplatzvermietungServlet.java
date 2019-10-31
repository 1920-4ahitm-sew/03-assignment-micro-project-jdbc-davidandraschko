package at.htl.sportplatzverwaltung.servlet;

import at.htl.sportplatzverwaltung.entity.Spielfeld;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("servlet")
public class SportplatzvermietungServlet extends HttpServlet {

    @PersistenceContext
    EntityManager em;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        TypedQuery<Spielfeld> query = em.createNamedQuery("GetAll", Spielfeld.class);
        List<Spielfeld> spielfelder = query.getResultList();
        resp.getWriter().printf("" + spielfelder);
    }

}
