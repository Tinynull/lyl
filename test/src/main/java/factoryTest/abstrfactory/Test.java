package factoryTest.abstrfactory;

/**
 * 抽象工厂模式更加有利于扩展，遵循了开闭原则.
 * 完全不需要知道内部是怎么实现的，只需要调用就行了.
 * 就像我们不需要手机具体是怎么生产的一样，我们只需要去店里面买就行了.
 *
 * @ClassName Test.
 * Create by Null on 2019/1/220:05
 **/
public class Test {

    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory();
        System.out.println(phoneFactory.getOnePlus().getPhoneName());
    }

}
