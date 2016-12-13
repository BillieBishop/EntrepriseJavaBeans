package account.ejb;

import java.util.ArrayList;
import java.util.Date;
import javax.ejb.Remote;

@Remote
public interface Quiz1AccountServiceRemote {

    void makeWithdrawal(double amount, double balance) throws AccountAccessException;

    void makeDeposit(double amount) throws AccountAccessException;

    void getOperationList(double balance, double amount, Date date) throws AccountAccessException;

    ArrayList<Operation> getAllOperations();

    Double getBalance(double amount, double balance);
    
}
