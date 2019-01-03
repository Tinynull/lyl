package singletonTest.seriable;

import java.io.Serializable;

/**
 * 序列化与反序列化时保障单例.
 * 重写readResolve.
 *
 * @ClassName Seriable.
 * Create by Null on 2019/1/3/21:06
 **/
public class Seriable implements Serializable {
    private Seriable() {
    }

    private static final Seriable INSTANCE = new Seriable();

    public static Seriable getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
