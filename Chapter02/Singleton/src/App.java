import java.util.Calendar;

import singleton.ConnectionPool;

public class App {
    public static void main(String[] args) throws Exception {
        ConnectionPool instance1 = ConnectionPool.getInstance();
        ConnectionPool instance2 = ConnectionPool.getInstance();

        System.out.println(instance1 == instance2);

        Calendar calendar = Calendar.getInstance();
        
    }
}
