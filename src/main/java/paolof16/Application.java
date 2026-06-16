package paolof16;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import paolof16.dao.GestioneEventiDAO;
import paolof16.entities.GestioneEventi;
import paolof16.entities.typeEvent;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("u412pu");
    public static void main(String[] args) {
        System.out.println("Hello World!");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        GestioneEventiDAO eventiDAO = new GestioneEventiDAO(entityManager);
        GestioneEventi firstEvent = new GestioneEventi("Concert", LocalDate.now(),"Lorem ipsum", typeEvent.PUBBLICO,300);
        GestioneEventi secondEvent = new GestioneEventi("Concert", LocalDate.now(),"Lorem ipsum", typeEvent.PUBBLICO,300);
        GestioneEventi thirdEvent = new GestioneEventi("Concert", LocalDate.now(),"Lorem ipsum", typeEvent.PUBBLICO,300);

      /*  eventiDAO.save(firstEvent);
        eventiDAO.save(secondEvent);
        eventiDAO.save(thirdEvent);*/

    }
}
