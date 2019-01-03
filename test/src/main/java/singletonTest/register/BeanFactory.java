package singletonTest.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单利模式.
 * 没使用一次，都忘一个固定的容器中去注册并且将使用过得对象进行缓存
 * 下次去取对象的时候就直接从缓存中取值，以保障每次获取的都是同一个对象.
 * 如果容器安全那么此单例就安全如果容器不安全单例就不安全例如：HashMap与ConcurrentHashMao.
 *
 * @ClassName BeanFactory.
 * Create by Null on 2019/1/3/20:51
 **/
public class BeanFactory {

    private BeanFactory() {
    }

    //    相当于ioc容器
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    private static Object getBean(String className) {
//        如果key不存在,那么就实例化出来一个
        if (!ioc.containsKey(className)) {
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        } else {
//            如果key存在，就直接赋值给他
            return ioc.get(className);
        }
    }

}
