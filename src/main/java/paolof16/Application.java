package paolof16;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import paolof16.dao.GestioneEventiDAO;
import paolof16.dao.LocationDAO;
import paolof16.dao.PartecipazioneDAO;
import paolof16.dao.PersonaDAO;
import paolof16.entities.GestioneEventi;
import paolof16.entities.Location;
import paolof16.entities.Persona;
import paolof16.entities.typeEvent;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("u412pu");
    public static void main(String[] args) {
        System.out.println("Hello World!");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        GestioneEventiDAO eventiDAO = new GestioneEventiDAO(entityManager);
        LocationDAO locationDAO = new LocationDAO(entityManager);
        PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO(entityManager);
        PersonaDAO personaDAO = new PersonaDAO(entityManager);
        //Partecipazione


        //Persona
        Persona firstPerson = new Persona("Franko", "Fiorentini","paolo.cafis@gmail.com",LocalDate.now());
        Persona secondPerson = new Persona("Matheo","Fiorentini","matheo.cafis@gmail.com", LocalDate.of(1998,2,12));
        personaDAO.save(firstPerson);
        personaDAO.save(secondPerson);

        //Location
        Location firstLocation = new Location("Palacio de Bellas Artes", "Mexico");
        Location secondLocation = new Location("San Siro","Milano");
        /*locationDAO.save(firstLocation);
        locationDAO.save(secondLocation);*/

        //Eventi
        GestioneEventi firstEvent = new GestioneEventi("Concert", LocalDate.now(),"Lorem ipsum", typeEvent.PUBBLICO,300,firstLocation);
        GestioneEventi secondEvent = new GestioneEventi("Concert", LocalDate.now(),"Lorem ipsum", typeEvent.PUBBLICO,300,secondLocation);
        GestioneEventi thirdEvent = new GestioneEventi("Concert", LocalDate.now(),"Lorem ipsum", typeEvent.PUBBLICO,300,firstLocation);

        eventiDAO.save(firstEvent);
        eventiDAO.save(secondEvent);
        eventiDAO.save(thirdEvent);



    }
}
