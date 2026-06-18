package paolof16.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import paolof16.entities.Location;
import paolof16.entities.Persona;

public class PersonaDAO {
    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Persona newPersona){
        EntityTransaction transaction = this.em.getTransaction();
        transaction.begin();
        this.em.persist(newPersona);
        transaction.commit();
        System.out.println("Location"+ newPersona + "created");
    }
    public Persona findById(long id){
        Persona fromDB = this.em.find(Persona.class, id);
        if(fromDB == null) throw new RuntimeException(String.valueOf(id));
        return fromDB;
    }
    public Persona deleteById(long id){
        Persona fromDB = this.findById(id);
        EntityTransaction transaction = this.em.getTransaction();
        transaction.begin();
        this.em.remove(fromDB);
        transaction.commit();
        System.out.println("Evento rimosso" + fromDB + "con essito");
        return fromDB;
    }
}
