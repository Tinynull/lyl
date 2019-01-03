package singletonTest.lazy;

/**
 * 优化版本的懒汉模式.
 * 加上了syn锁,就相当于是线程安全的，但是效率特别慢.
 *
 * @ClassName LazyTwo.
 * Create by Null on 2019/1/319:42
 **/
public class LazyTwo {

    private LazyTwo(){}

    private static LazyTwo lazy = null;

    public static final synchronized LazyTwo getInstance(){
        if (lazy == null) {
            lazy = new LazyTwo();
        }
        return lazy;
    }
}
