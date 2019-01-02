package factoryTest.methorfactory;

/**
 * @ClassName AdidasFactory.
 * Create by Null on 2019/1/219:52
 **/
public class AdidasFactory {

    public Shoe getName(){
        return new Adidas();
    }
}
