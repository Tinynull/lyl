package singletonTest.lazy;

/**
 * 懒汉模式.
 * 在调用方法的时候才实例化，并创建对象.
 * 节省了空间支援.
 * 线程不安全的:如果多线程同时访问，那么他会创建多个实例.
 *
 * @ClassName LazyOne.
 * Create by Null on 2019/1/319:37
 **/
public class LazyOne {

    private LazyOne(){}

    //静态块，公共内存区域
    private static LazyOne lazy = null;

    public static final LazyOne getInstamce(){
        if (lazy == null) {
            lazy = new LazyOne();
        }

        return lazy;
    }

}
