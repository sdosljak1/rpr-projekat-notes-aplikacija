package ba.unsa.etf.rpr.dao;
import ba.unsa.etf.rpr.domain.Vlasnik;
import ba.unsa.etf.rpr.exceptions.BiljeskaException;

import java.sql.ResultSet;
import java.util.Map;

public class VlasnikDaoSQLImpl extends AbstractDao<Vlasnik> implements VlasnikDao{
    private static  VlasnikDaoSQLImpl instance = null;
    private VlasnikDaoSQLImpl() {
        super("vlasnik");
    }

    public static VlasnikDaoSQLImpl getInstance(){
        if(instance==null)
            instance = new VlasnikDaoSQLImpl();
        return instance;
    }

    public static void removeInstance(){
        if(instance!=null)
            instance=null;
    }

    @Override
    public Vlasnik row2object(ResultSet rs) throws BiljeskaException {
        return null;
    }

    @Override
    public Map<String, Object> object2row(Vlasnik object) {
        return null;
    }
}
