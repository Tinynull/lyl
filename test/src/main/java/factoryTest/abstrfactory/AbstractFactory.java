package factoryTest.abstrfactory;

/**
 * @ClassName AbstractFactory.
 * Create by Null on 2019/1/219:59
 **/
public abstract class AbstractFactory {

    /**
     * 获取一加手机.
     *
     * @return phone
     */
    public abstract Phone getOnePlus();

    /**
     * 获取华为手机.
     *
     * @return phone
     */
    public abstract Phone getHuaw();
}
