package at.htl.sportplatzvermietungee.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@NamedQueries(@NamedQuery(name = "GetAll", query = "select s from Spielfeld s where s.SpielfeldId = ?1"))
public class Spielfeld implements Serializable {

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

}
