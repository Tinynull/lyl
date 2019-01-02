package factoryTest.factory; /**
 * @Author: null
 * @Date: 2019/1/2 19:12
 */

/**
 * 简单工厂模式.
 *
 * @ClassName CarFactoryTest.
 * Create by Null on 2019/1/219:12
 **/
public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory CarFactory = new CarFactory();
        String name = CarFactory.qeq("大众汽车");
        System.out.println(name);
    }
}
