package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Biljeska;
import ba.unsa.etf.rpr.domain.Vlasnik;
import ba.unsa.etf.rpr.domain.Kategorija;

public interface BiljeskaDao extends Dao<Biljeska> {
}

/*
public interface Biljeska {
    void setNaslov(String naslov);
    void setSadrzaj(String sadrzaj);
    void setVlasnik(Vlasnik vlasnik);
    void setKategorija(Kategorija kategorija);
    void setDatum(Date datum);

    String getNalov();
    String getSadrzaj();
    Vlasnik getVlasnik();
    Kategorija getKazegorija();
    Date getDatum();
    }
 */