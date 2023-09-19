package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Biljeska;
import ba.unsa.etf.rpr.domain.Vlasnik;
import ba.unsa.etf.rpr.domain.Kategorija;
import java.util.List;

public interface BiljeskaDao extends Dao<Biljeska> {
    /**
     * Returns all quotes that contains given text.
     *
     * @param text search string for quotes
     * @return list of quotes
     */
    List<Biljeska> searchByText(String text) throws QuoteException;

    /**
     * Returns all quotes that contains given text.
     *
     * @param kategorija search string for quotes
     * @return list of quotes
     */
    List<Biljeska> searchByCategory(Kategorija kategorija) throws QuoteException;

    /**
     * Return random quote from database
     *
     * @return random quote
     * @throws QuoteException
     */

    List<Biljeska> searchByOwner(Vlasnik vlasnik) throws QuoteException;

    Biljeska randomQuote() throws QuoteException;
}