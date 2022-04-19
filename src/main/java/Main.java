import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int poolsNumber = 64;
        final MyRunnable myRunnable =new MyRunnable();
        Executors.newFixedThreadPool(poolsNumber).execute(myRunnable);


    }
}
