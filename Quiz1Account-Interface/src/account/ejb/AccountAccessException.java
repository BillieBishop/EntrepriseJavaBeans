package account.ejb;

public class AccountAccessException extends Exception{
    
    public AccountAccessException(String message) throws AccountAccessException{
        super(message);
    }
    
}
