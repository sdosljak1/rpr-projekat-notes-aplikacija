package ba.unsa.etf.rpr.exeptions;

public class BiljeskaExeption extends Exception{
    public BiljeskaException(String msg, Exception reason){
        super(msg, reason);
    }

    public BiljeskaException(String msg){
        super(msg);
    }
}
