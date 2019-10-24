package at.htl.sportplatzverwaltung.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Spielfeld {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SpielfeldId;
    private int hoehe;
    private int breite;

    public Spielfeld(int hoehe, int breite) {
        this.hoehe = hoehe;
        this.breite = breite;
    }

    public Spielfeld(){

    }

    public Long getSpielfeldId() {
        return SpielfeldId;
    }

    /*public void setSpielfeldId(Long spielfeldId) {
        SpielfeldId = spielfeldId;
    }*/

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }
}
