package account.ejb;

import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable{
    Double balance;
    public Double amount;
    public Date date;

    public Operation(Double balance, Double amount, Date date) {
        this.balance = balance;
        this.amount = amount;
        this.date = date;
    }
    
    
}
