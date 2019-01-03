package factoryTest.methorfactory;

/**
 * 工厂方法模式.
 *
 * @ClassName ShoeFactoryTest.
 * Create by Null on 2019/1/219:53
 **/
public class ShoeFactoryTest {

    public static void main(String[] args) {
        factoryTest.methorfactory.NikeFactory nikeFactory = new factoryTest.methorfactory.NikeFactory();
        System.out.println(nikeFactory.getName());
    }
}
