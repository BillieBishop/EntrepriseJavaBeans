package account.ejb;

import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
public class Quiz1AccountService implements Quiz1AccountServiceRemote {
    
    private ArrayList<Operation> operationList = new ArrayList<>();
    
    @PostConstruct
    void init(){
        operationList = new ArrayList<>();
    }
    
    @Override
    public Double getBalance(double amount, double balance) {        
        return balance;
    }

    @Override
    @Lock(LockType.WRITE)
    public void makeDeposit(double amount) throws AccountAccessException{
        // throw exception if deposit is negative 
        if (amount < 0) {
            throw new AccountAccessException("Deposit can't be negative.");        
        }
    }    
    
    @Override
    @Lock(LockType.WRITE)
    public void makeWithdrawal(double amount, double balance) throws AccountAccessException{
        // throw exception if withdrawal is negative 
        if (amount < 0) {
            throw new AccountAccessException("Withdrawal can't be negative.");        
        }
        
        // throw exception if there is not enough money
        // in the account to withdraw without going below 0
        if (balance < 0) {
            throw new AccountAccessException("Balance can't be negative.");        
        }
    }
    
    

    @Override
    public void getOperationList(double balance, double amount, Date date) throws AccountAccessException{
        if (amount < 0) {
            throw new AccountAccessException("Deposit can't be negative.");        
        }
        if (amount < 0) {
            throw new AccountAccessException("Withdrawal can't be negative.");        
        }
        operationList.add(new Operation(balance, amount, new Date()));
    }

    @Override
    @Lock(LockType.READ)
    public ArrayList<Operation> getAllOperations() {
        //FIXME: should clone list and list elements ? 
        //FIXME: We would have to add Clonable to Account
        //FIXME: In this case, I don't think we need to
        return operationList;
    }

}
