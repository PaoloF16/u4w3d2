package paolof16.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Gestione_Eventi")
public class GestioneEventi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private long id;
    @Column(name = "title_id")
    private String title;
    @Column(name = "data_Event")
    private LocalDate dataEvento;
    @Column
    private String description;

    @Column(name="type_event")
    @Enumerated(EnumType.STRING)
    private typeEvent tipoEvento;

    @Column(name="max_users")
    private int numeroMassimoPartecipanti;


    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public GestioneEventi( String title, LocalDate dataEvento, String description, typeEvent tipoEvento, int numeroMassimoPartecipanti,Location location){
        this.title = title;
        this.dataEvento = dataEvento;
        this.description = description;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.location = location;

    }
    protected GestioneEventi(){

    }

    public void setEventType( typeEvent tipoEvento){
        this.tipoEvento = tipoEvento;
    }

    @Override
    public String toString() {
        return "GestioneEventi{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dataEvento=" + dataEvento +
                ", description='" + description + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public String getDescription() {
        return description;
    }

    public typeEvent getTipoEvento() {
        return tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }


}
