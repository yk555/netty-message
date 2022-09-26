package tmp;

import tmp.Server.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudStudyDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStudyDemoApplication.class,args);
        try {
            new NettyServer(12345).start();
            System.out.println("https://blog.csdn.net/moshowgame");
            System.out.println("http://127.0.0.1:6688/netty-websocket/index");
        }catch(Exception e) {
            System.out.println("NettyServerError:"+e.getMessage());
        }
    }
}
