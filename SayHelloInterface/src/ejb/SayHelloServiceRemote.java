
package ejb;

import javax.ejb.Remote;


@Remote
public interface SayHelloServiceRemote {

    String SayHello(String name);
    
}
