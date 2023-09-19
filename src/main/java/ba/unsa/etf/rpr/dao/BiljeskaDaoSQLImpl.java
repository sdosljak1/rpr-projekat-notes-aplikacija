package ba.unsa.etf.rpr.dao;
import ba.unsa.etf.rpr.domain.Biljeska;
import ba.unsa.etf.rpr.domain.Vlasnik;
import ba.unsa.etf.rpr.domain.Kategorija;
import ba.unsa.etf.rpr.exceptions.BiljeskaException;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BiljeskaDaoSQLImpl extends AbstractDao<Biljeska> implements BiljeskaDao{
    private static BiljeskaDaoSQLImpl instance = null;
    private BiljeskaDaoSQLImpl() {
        super("quotes");
    }

    /**
     * @author abrulic1
     * @return QuoteDaoSQLImpl
     * We don't need more than one object for CRUD operations on table 'quotes' so we will use Singleton
     * This method will call private constructor in instance==null and then return that instance
     */
    public static BiljeskaDaoSQLImpl getInstance(){
        if(instance==null)
            instance = new BiljeskaDaoSQLImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    @Override
    public Biljeska row2object(ResultSet rs) throws BiljeskaException{
        try {
            Biljeska q = new Biljeska();
            q.setId(rs.getInt("id"));
            q.setNaslov(rs.getString("naslov"));
            q.setSadrzaj(rs.getString("sadrzaj"));
            q.setDatum(rs.getDate("datum"));
            q.setVlasnik(DaoFactory.vlasnikDao().getById(rs.getInt("vlasnik_id")));
            q.setKategorija(DaoFactory.kategorijaDao().getById(rs.getInt("kategorija_id")));
            return q;
        } catch (Exception e) {
            throw new BiljeskaException(e.getMessage(), e);
        }
    }

    /**
     * @param object - object to be mapped
     * @return map representation of object
     */
    @Override
    public Map<String, Object> object2row(Biljeska object) {
        Map<String, Object> item = new TreeMap<>();
        item.put("id", object.getId());
        item.put("vlasnik_id", object.getVlasnik().getId());
        item.put("kategorija_id", object.getKategorija().getId());
        item.put("naslov", object.getNaslov());
        item.put("sadrzaj", object.getSadrzaj());
        item.put("datum", object.getDatum());

        return item;
    }

    /**
     * @param text search string for quotes
     * @return list of quotes
     * @author ahajro2
     */

    @Override
    public List<Biljeska> searchByText(String text) throws BiljeskaException{
        return executeQuery("SELECT * FROM quotes WHERE quote LIKE concat('%', ?, '%')", new Object[]{text});
    }

    @Override
    public List<Biljeska> searchByCategory(Kategorija kategorija) throws BiljeskaException {
        return null;
    }

    @Override
    public List<Biljeska> searchByOwner(Vlasnik vlasnik) throws BiljeskaException {
        return null;
    }

    /**
     * @param category search string for quotes
     * @return list of quotes
     * @author ahajro2
     */
    //@Override
    public List<Biljeska> searchByCategory(Biljeska category) throws BiljeskaException{
        return executeQuery("SELECT * FROM quotes WHERE category_id = ?", new Object[]{category.getId()});
    }

    /**
     * @return random quote from DB
     * @throws BiljeskaException in case of error working with db
     */
    @Override
    public Biljeska randomQuote() throws BiljeskaException {
        return executeQueryUnique("SELECT * FROM quotes ORDER BY RAND() LIMIT 1", null);
    }
}
