package ba.unsa.etf.rpr.dao;
import ba.unsa.etf.rpr.domain.Vlasnik;

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
}
