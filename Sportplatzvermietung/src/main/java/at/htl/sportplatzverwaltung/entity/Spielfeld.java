package at.htl.sportplatzverwaltung.entity;

import javax.persistence.*;

@Entity
@NamedQueries(@NamedQuery(name = "GetAll", query = "select s from Spielfeld s"))
public class Spielfeld {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SpielfeldId;
    private int laenge;
    private int breite;

    public Spielfeld(int laenge, int breite) {
        this.setLaenge(laenge);
        this.setBreite(breite);
    }

    public Spielfeld(){

    }


    public Long getSpielfeldId() {
        return SpielfeldId;
    }



    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }
}
