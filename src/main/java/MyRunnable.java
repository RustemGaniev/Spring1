import ru.netology.Server;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        Server.startServer();
    }
}
