package factoryTest.abstrfactory;

/**
 * @ClassName PhoneFactory.
 * Create by Null on 2019/1/220:04
 **/
public class PhoneFactory extends AbstractFactory {
    /**
     * 获取一加手机.
     *
     * @return phone
     */
    @Override
    public Phone getOnePlus() {
        return new OnePlus();
    }

    /**
     * 获取华为手机.
     *
     * @return phone
     */
    @Override
    public Phone getHuaw() {
        return new Huaw();
    }
}
