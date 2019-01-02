import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    /**
     * join的作用
     */
//    public static void main(String[] args) {
//        Thread t1 = new MyThread();
//        t1.start();
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println("主线程第" + i +"次执行！");
//            if (i > 2)try {
//                //t1线程合并到主线程中，主线程停止执行过程，转而执行t1线程，直到t1执行完毕后继续。
//                t1.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    private static volatile int x = 0, y = 0;
    private static volatile int a = 0, b = 0;
    private static Object object;


    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(16);
//        for (int i = 1; i <= 10000; i++) {
//            new Thread(new DemoThread1(i)).start();
//        }
        System.out.println(System.currentTimeMillis());
//        object.wait();
    }


    static class DemoThread1 implements Runnable {

        private int i;

        public DemoThread1(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            try {
                for (int j = 0; j < 5000; j++) {
                    System.out.println(i);
                }
            } finally {
            }
        }
    }

}
