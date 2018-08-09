package RmiServer;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiInterf extends Remote{

    String SayHello() throws RemoteException;

}
