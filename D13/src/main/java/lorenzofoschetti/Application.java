package lorenzofoschetti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lorenzofoschetti.dao.EventiDAO;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d13");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventiDAO ed = new EventiDAO(em);

        em.close();
        emf.close();
    }
}
