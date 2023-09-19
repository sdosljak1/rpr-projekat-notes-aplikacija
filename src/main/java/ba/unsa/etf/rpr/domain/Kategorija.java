package ba.unsa.etf.rpr.domain;
import java.util.Objects;

public class Kategorija implements Idable{
    private int id;
    private String naziv;

    public Kategorija(String name) {
        this.naziv = naziv;
    }

    public Kategorija() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kategorija kategorija = (Kategorija) o;
        return id == kategorija.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, naziv);
    }

}
