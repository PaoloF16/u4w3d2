package paolof16.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import paolof16.entities.GestioneEventi;
import paolof16.entities.Location;

public class LocationDAO {
    private final EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Location newlocation){
        EntityTransaction transaction = this.em.getTransaction();
        transaction.begin();
        this.em.persist(newlocation);
        transaction.commit();
        System.out.println("Location"+ newlocation + "created");
    }
    public Location findById(long id){
        Location fromDB = this.em.find(Location.class, id);
        if(fromDB == null) throw new RuntimeException(String.valueOf(id));
        return fromDB;
    }
    public Location deleteById(long id){
        Location fromDB = this.findById(id);
        EntityTransaction transaction = this.em.getTransaction();
        transaction.begin();
        this.em.remove(fromDB);
        transaction.commit();
        System.out.println("Evento rimosso" + fromDB + "con essito");
        return fromDB;
    }
}
