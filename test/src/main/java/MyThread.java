import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

    private CountDownLatch countDownLatch;


    public MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1第" + i + "次执行！");
        }
        countDownLatch.countDown();
    }

}
