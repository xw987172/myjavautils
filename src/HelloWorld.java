import RmiServer.RmiServerClass;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloWorld {
    public static void main(String argv[]) throws Exception{


        String name = "rmi.server.xwDemoService";
        //创建服务
        RmiServerClass rms = new RmiServerClass();
        // 创建本机1099端口上的RMI注册表
        Registry registry1 = LocateRegistry.createRegistry(1099);

        /***************** 以下为注册方法一 ************/
        // 将服务绑定到注册表中
        registry1.bind(name, rms);

        /***************** 以下为注册方法二 ************/
        // Naming.bind(name, service);

        /***************** 以下为注册方法三 ************/
        Context namingContext = new InitialContext();
        namingContext.rebind("rmi://127.0.0.1:1099/" + name, rms); // 此方式 name 需要以 rmi: 开头
        System.out.println("rmi服务已开启");
    }
}
