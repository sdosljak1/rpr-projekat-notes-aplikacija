package ba.unsa.etf.rpr.domain;
import java.util.Date;
import java.util.Objects;

public class Biljeska implements Idable{

    private int id;
    private String naslov;
    private String sadrzaj;
    private Date datum;

    public Biljeska(String naziv) {
        this.naslov = naslov;
    }

    public Biljeska() {
        naslov = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    @Override
    public String toString() {
        return naslov;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biljeska biljeska = (Biljeska) o;
        return id == biljeska.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, naslov);
    }
}