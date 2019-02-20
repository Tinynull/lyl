package delegate;

/**
 * @ClassName StaffB.
 * Create by Null on 2019/2/20/15:57
 **/
public class StaffB implements ITarget{

    @Override
    public void doing(String command) {
        System.out.println("二五仔B开始干活了"+command);
    }
}
