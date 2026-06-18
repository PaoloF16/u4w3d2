package paolof16.entities;

import jakarta.persistence.*;

@Entity
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private GestioneEventi eventi;
    @Enumerated(EnumType.STRING)
    private Stato stato;

    public Partecipazione(GestioneEventi eventi){

        this.eventi = eventi;
    }

    public long getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
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
                ", persona=" + persona +
                ", eventi=" + eventi +
                ", stato=" + stato +
                '}';
    }
}
