import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        for (Scanner scanner = new Scanner(System.in); ; ) {
            System.out.println(scanner.nextLine()
            .replaceAll("吗?[？?]", "!"));
        }
    }
}
