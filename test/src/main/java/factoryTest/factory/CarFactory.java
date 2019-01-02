package factoryTest.factory;

/**
 * @ClassName CarFactory.
 * Create by Null on 2019/1/219:30
 **/
public class CarFactory {

    public String qeq(String name) {

        if (name.equals("吉利汽车")) {
            return new Jili().getName();
        } else if (name.equals("大众汽车")) {
            return new Dazhong().getName();
        }
        return null;
    }

}
