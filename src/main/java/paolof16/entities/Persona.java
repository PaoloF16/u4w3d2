package paolof16.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long person_id;
    private String first_name;
    private String last_name;
    private String email;
    @Column(name = "date_of_birth")
    private LocalDate datebirth;
    @Enumerated(EnumType.STRING)
    private Sesso sesso;
    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> listaPartecipazione;

    public Persona(){

    }

    public Persona(String first_name,String last_name,String email,LocalDate datebirth){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.datebirth = LocalDate.now();
    }
    public void setSesso(Sesso sesso){
        this.sesso = sesso;
    }

    public long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(LocalDate datebirth) {
        this.datebirth = datebirth;
    }

    public Sesso getSesso() {
        return sesso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "person_id=" + person_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", datebirth=" + datebirth +
                ", sesso=" + sesso +
                '}';
    }
}
