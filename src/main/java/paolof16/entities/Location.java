package paolof16.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "location_id")
    private long id;
    private String name;
    private String citta;

    public Location(String name, String citta){
        this.name = name;
        this.citta = citta;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCitta() {
        return citta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }
}