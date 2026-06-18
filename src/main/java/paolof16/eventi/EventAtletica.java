package paolof16.eventi;

import paolof16.entities.GestioneEventi;
import paolof16.entities.Persona;

public class EventAtletica extends GestioneEventi {
    private Persona atleti;
    private Persona winner;

    public Persona getAtleti() {
        return atleti;
    }

    public Persona getWinner() {
        return winner;
    }
}
