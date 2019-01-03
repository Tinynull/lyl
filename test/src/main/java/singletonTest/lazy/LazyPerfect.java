package singletonTest.lazy;

/**
 * 完美的懒汉模式.
 * 在外部类被调用的时候内部类才会被加载.
 * 不仅不用浪费内存，且效率提高
 *
 * @ClassName LazyPerfect.
 * Create by Null on 2019/1/3/19:46
 **/
public class LazyPerfect {

    private boolean initialized = false;

    //防止反射侵入
    private LazyPerfect() {
        synchronized (LazyPerfect.class) {
            if (initialized == false) {
                initialized = !initialized;
            } else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }

    //保证这个方法不被覆盖
    public static final LazyPerfect getInstance() {
        return LazyHolder.LZAY;
    }

    //子类:默认不加载
    private static class LazyHolder {
        private static final LazyPerfect LZAY = new LazyPerfect();
    }

}
