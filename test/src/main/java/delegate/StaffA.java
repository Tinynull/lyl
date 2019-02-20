package delegate;

/**
 * @ClassName StaffA.
 * Create by Null on 2019/2/20/15:57
 **/
public class StaffA implements ITarget {
    @Override
    public void doing(String command) {
        System.out.println("二五仔A开始干活了" + command);
    }
}
