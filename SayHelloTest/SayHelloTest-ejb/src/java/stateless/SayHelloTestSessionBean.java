package stateless;

import javax.ejb.Stateless;

@Stateless
public class SayHelloTestSessionBean implements SayHelloTestSessionBeanRemote {

    @Override
    public String getMessage() {
        return "Hello EJB World!";
    }    
}