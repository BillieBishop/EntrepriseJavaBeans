package ejb;

import javax.ejb.Stateless;


@Stateless
public class SayHelloService implements SayHelloServiceRemote {

    @Override
    public String SayHello(String name) {
        return String.format("Hi %s, nice to meet you!", name);
    }

    
}
