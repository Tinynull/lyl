package singletonTest.hunfry;

/**
 * 饿汉模式.
 * 在类加载的时候初始化，并创建对象。
 * 有的时候占着茅坑不拉屎，浪费空间。
 * 但是线程安全，因为无论多少线程访问他都是一个样不会变，加了final无法被覆盖.
 *
 * @ClassName Hungry.
 * Create by Null on 2019/1/31/9:28
 **/
public class Hungry {

    private Hungry() {}

    private static final Hungry hungry = new Hungry();

    public static final Hungry getInstance() {
        return hungry;
    }

}
