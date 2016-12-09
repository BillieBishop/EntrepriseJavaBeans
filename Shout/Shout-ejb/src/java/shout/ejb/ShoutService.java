package shout.ejb;

import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton
public class ShoutService implements ShoutServiceRemote {

    private ArrayList<Shout> shoutList = new ArrayList<>();
    
    @PostConstruct
    void init(){
        shoutList = new ArrayList<>();
    }
    
    @Override
    public void addShout(String name, String shout) throws InvalidShoutDataException {
        if ((name == null) || (name.length() < 2)) {
            throw new InvalidShoutDataException("Name must be at least 2 characters long.");
        }
        
        if ((shout == null) || (shout.length() < 2)) {
            throw new InvalidShoutDataException("Shout must not be empty.");
        }
        
        shoutList.add(new Shout(name, shout, new Date()));        
    }

    @Override
    public ArrayList<Shout> getallShouts() {
        //FIXME: should clone list and list elements (add Clonable to Shout)
        return shoutList;
    }
    
}
