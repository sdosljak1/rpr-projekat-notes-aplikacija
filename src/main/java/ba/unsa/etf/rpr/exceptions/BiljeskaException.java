package ba.unsa.etf.rpr.exceptions;

public class BiljeskaException extends Exception{
    public BiljeskaException(String msg, Exception reason){
        super(msg, reason);
    }

    public BiljeskaException(String msg){
        super(msg);
    }
}
