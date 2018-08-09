package RmiServer;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiServerClass extends UnicastRemoteObject implements RmiInterf {

    public RmiServerClass() throws RemoteException{
        super();
    }

    @Override
    public String SayHello() throws RemoteException{

        return "hello ,I'm server.";

    }
}
