package paolof16.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import paolof16.entities.Partecipazione;


public class PartecipazioneDAO {
    private final EntityManager em;


    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Partecipazione newListP){
        EntityTransaction transaction = this.em.getTransaction();
        transaction.begin();
        this.em.persist(newListP);
        transaction.commit();
        System.out.println("Partecipazione"+ newListP + "created");
    }
    public PartecipazioneDAO findById(long id){
        PartecipazioneDAO fromDB = this.em.find(PartecipazioneDAO.class, id);
        if(fromDB == null) throw new RuntimeException(String.valueOf(id));
        return fromDB;
    }
    public PartecipazioneDAO deleteById(long id){
        PartecipazioneDAO fromDB = this.findById(id);
        EntityTransaction transaction = this.em.getTransaction();
        transaction.begin();
        this.em.remove(fromDB);
        transaction.commit();
        System.out.println("Evento rimosso" + fromDB + "con essito");
        return fromDB;
    }
}
