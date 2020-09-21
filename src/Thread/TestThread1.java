package Thread;

import javax.script.ScriptException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestThread1 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestThread1 testThread1=new TestThread1();
        FutureTask<Integer> futureTask=new FutureTask<Integer>(testThread1);
        Thread thread=new Thread(futureTask);
        thread.start();
        Integer integer=futureTask.get();
        System.out.println(integer);
    }
}
