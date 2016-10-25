/**
 * Created by medinaali on 4/26/16.
 */
import java.rmi.*;
import java.rmi.server.*;

public class StartServer {
    public static void main(String[] args) {
        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);

            ChatServerInt b = new ChatServer();
            Naming.rebind("rmi://172.17.57.156/myabc", b);
            System.out.println("[System] Chatting Server is ready.");
        }
        catch (Exception e) {
            System.out.println("Chatting Server failed: " + e);
        }
    }
}