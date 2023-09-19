package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Biljeska;
import ba.unsa.etf.rpr.domain.Kategorija;

public class DaoFactory {
    private static final KategorijaDao kategorijaDao = KategorijaDaoSQLImpl.getInstance();
    private static final BiljeskaDao biljeskaDao = BiljeskaDaoSQLImpl.getInstance();
    private static final VlasnikDao vlasnikDao = VlasnikDaoSQLImpl.getInstance();
    private DaoFactory(){
    }

    public static KategorijaDao kategorijaDao(){
        return kategorijaDao;
    }

    public static BiljeskaDao biljeskaDao(){
        return biljeskaDao;
    }

    public static VlasnikDao vlasnikDao(){
        return vlasnikDao;
    }
}
