package factoryTest.methorfactory;

/**
 * 工厂方法模式.
 *
 * @ClassName ShoeFactoryTest.
 * Create by Null on 2019/1/219:53
 **/
public class ShoeFactoryTest {

    public static void main(String[] args) {
        NikeFactory nikeFactory = new NikeFactory();
        System.out.println(nikeFactory.getName().getName());
    }
}
