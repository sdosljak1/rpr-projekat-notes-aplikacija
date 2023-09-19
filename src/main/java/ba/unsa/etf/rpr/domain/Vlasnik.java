package ba.unsa.etf.rpr.domain;
import java.util.Objects;

public class Vlasnik implements Idable{
    private int id;
    private String ime;
    private String prezime;
    private String email;
    
    public Vlasnik(int id, String ime, String prezime, String email) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }
    
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String ime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Vlasnik{" +
                "id=" + id +
                ", Ime='" + ime + '\'' +
                ", Prezime =" + prezime +
                ", email =" + email +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vlasnik vlasnik = (Vlasnik) o;
        return id == vlasnik.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ime, prezime, email);
    }
}
