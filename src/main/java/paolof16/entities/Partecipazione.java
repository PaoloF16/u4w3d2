package paolof16.entities;

import jakarta.persistence.*;

@Entity
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private Persona people;
    private GestioneEventi eventi;
    @Enumerated(EnumType.STRING)
    private Stato stato;

    public Partecipazione(){

    }

    public long getId() {
        return id;
    }

    public Persona getPeople() {
        return people;
    }

    public GestioneEventi getEventi() {
        return eventi;
    }

    public Stato getStato() {
        return stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", people=" + people +
                ", eventi=" + eventi +
                ", stato=" + stato +
                '}';
    }
}
