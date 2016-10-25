/**
 * Created by medinaali on 4/26/16.
 */
import java.rmi.*;

public interface ChatClientInt extends Remote{
    public void tell (String name)throws RemoteException ;
    public String getName()throws RemoteException ;
}