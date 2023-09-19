package ba.unsa.etf.rpr.dao;
import ba.unsa.etf.rpr.domain.Biljeska;
import ba.unsa.etf.rpr.domain.Vlasnik;
import ba.unsa.etf.rpr.domain.Kategorija;
import java.util.List;
import ba.unsa.etf.rpr.exceptions.BiljeskaException;

public interface BiljeskaDao extends Dao<Biljeska>{
    /**
     * Returns all quotes that contains given text.
     *
     * @param text search string for quotes
     * @return list of quotes
     */
    List<Biljeska> searchByText(String text) throws BiljeskaException;

    /**
     * Returns all quotes that contains given text.
     *
     * @param kategorija search string for quotes
     * @return list of quotes
     */
    List<Biljeska> searchByCategory(Kategorija kategorija) throws BiljeskaException;

    List<Biljeska> searchByOwner(Vlasnik vlasnik) throws BiljeskaException;

    /**
     * Return random quote from database
     *
     * @return random biljeska
     * @throws BiljeskaException
     */
    Biljeska randomQuote() throws BiljeskaException;
}
