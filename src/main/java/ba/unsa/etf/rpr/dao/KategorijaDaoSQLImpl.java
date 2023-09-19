package ba.unsa.etf.rpr.dao;
import ba.unsa.etf.rpr.domain.Kategorija;
import ba.unsa.etf.rpr.exceptions.BiljeskaException;
import ba.unsa.etf.rpr.exceptions.BiljeskaException;

import java.sql.*;
import java.util.Map;
import java.util.TreeMap;

public class KategorijaDaoSQLImpl extends AbstractDao<Kategorija> implements KategorijaDao{
    private static  KategorijaDaoSQLImpl instance = null;
    private KategorijaDaoSQLImpl() {
        super("kategorija");
    }

    public static KategorijaDaoSQLImpl getInstance(){
        if(instance==null)
            instance = new KategorijaDaoSQLImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    @Override
    public Kategorija row2object(ResultSet rs) throws BiljeskaException {
        try {
            Kategorija cat = new Kategorija();
            cat.setId(rs.getInt("id"));
            cat.setNaziv(rs.getString("naziv"));
            return cat;
        } catch (SQLException e) {
            throw new BiljeskaException(e.getMessage(), e);
        }
    }

    @Override
    public Map<String, Object> object2row(Kategorija object) {
        Map<String, Object> row = new TreeMap<>();
        row.put("id", object.getId());
        row.put("naziv", object.getNaziv();
        return row;
    }
}
