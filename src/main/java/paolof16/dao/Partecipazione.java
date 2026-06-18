package paolof16.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import paolof16.entities.Location;

public class Partecipazione {
    private final EntityManager em;

    public Partecipazione(EntityManager em) {
        this.em = em;
    }
    public void save(Partecipazione newListP){
        EntityTransaction transaction = this.em.getTransaction();
        transaction.begin();
        this.em.persist(newListP);
        transaction.commit();
        System.out.println("Partecipazione"+ newListP + "created");
    }
    public Partecipazione findById(long id){
        Partecipazione fromDB = this.em.find(Partecipazione.class, id);
        if(fromDB == null) throw new RuntimeException(String.valueOf(id));
        return fromDB;
    }
    public Partecipazione deleteById(long id){
        Partecipazione fromDB = this.findById(id);
        EntityTransaction transaction = this.em.getTransaction();
        transaction.begin();
        this.em.remove(fromDB);
        transaction.commit();
        System.out.println("Evento rimosso" + fromDB + "con essito");
        return fromDB;
    }
}
