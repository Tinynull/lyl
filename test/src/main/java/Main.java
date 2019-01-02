import sun.text.CollatorUtilities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        CountDownLatch countDownLatch = new CountDownLatch(5);
//        for (int i = 0; i < 5; i++) {
//            MyThread myThread = new MyThread(countDownLatch);
//            myThread.start();
//        }
//        countDownLatch.await();
//        System.out.println("all done");
//        long endTime = date2max(new Date()).getTime() - 1000l * 60 * 30;
//        System.out.println(endTime);
//        for (int i = 0; i < 5; i++){
//            System.out.println(i);
//            if (i==2){
//                return;
//            }
//        }

//        long endTime = date2max(new Date()).getTime() - 1000L * 60 * 30;


        String deptChain = "12-3-5-6";
        String deptChain1 = "12";
        String[] split = deptChain.split("-");
        String[] split1 = deptChain1.split("-");
        int length = split.length;
        System.out.println(split1.length);
        System.out.println(length);

    }

    public static Date date2max(Date date) {
        if (null == date) {
            date = new Date();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);

        return calendar.getTime();
    }
}
