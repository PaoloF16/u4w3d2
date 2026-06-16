package paolof16.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import paolof16.entities.GestioneEventi;
import paolof16.entities.typeEvent;

public class GestioneEventiDAO {
    private final EntityManager entityManager;

    public GestioneEventiDAO(EntityManager entity){
        this.entityManager = entity;
    }
    public void save(GestioneEventi newEvent){
        EntityTransaction transaction = this.entityManager.getTransaction();

        transaction.begin();

        this.entityManager.persist(newEvent);

        transaction.commit();
        System.out.println("Evento" + newEvent  + "Creato");
    }
    public GestioneEventi findById(long id){
        GestioneEventi fromDB = this.entityManager.find(GestioneEventi.class, id);
        if(fromDB == null) throw new RuntimeException(String.valueOf(id));
        return fromDB;
    }
    
}
