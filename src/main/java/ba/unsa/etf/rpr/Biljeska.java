package ba.unsa.etf.rpr;

import java.util.Date;

public interface Biljeska {
    void setNaslov(String naslov);
    void setSadrzaj(String sadrzaj);
    void setVlasnik(Vlasnik vlasnik);
    void setKategorija(Kategorija kategorija);
    void setDatum(Date datum);
}
