package ba.unsa.etf.rpr.domain;
import java.util.Date;
import java.util.Objects;

public class Biljeska {
    private int id;
    private Vlasnik vlasnik;
    private Kategorija kategorija;
    private String naslov;
    private String sadrzaj;
    private Date datum;

    public Biljeska(String naziv) {
        this.naslov = naslov;
    }

    public Biljeska(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    public Biljeska(Vlasnik vlasnik, Kategorija kategorija, String naslov, String sadrzaj, Date datum) {
        this.vlasnik = vlasnik;
        this.kategorija = kategorija;
        this.naslov = naslov;
        this.sadrzaj = sadrzaj;
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Biljeska{" +
                "id=" + id +
                ", nalsov='" + naslov + '\'' +
                ", sadrzaj=" + sadrzaj +
                ", datum=" + datum +
                '}';
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
        return Objects.hash(id, vlasnik, kategorija, naslov, sadrzaj, datum);
    }
}
