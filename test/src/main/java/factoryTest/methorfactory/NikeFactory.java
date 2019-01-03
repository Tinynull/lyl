package factoryTest.methorfactory;

/**
 * @ClassName NikeFactory.
 * Create by Null on 2019/1/219:52
 **/
public class NikeFactory {

    public factoryTest.methorfactory.Shoe getName() {
        return new factoryTest.methorfactory.Nike();
    }

}
