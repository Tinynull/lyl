package delegate;

import java.util.HashMap;

/**
 * @ClassName Manager.
 * Create by Null on 2019/2/20/15:57
 **/
public class Manager implements ITarget {


    HashMap<String, ITarget> hashMap = new HashMap<>();

    public Manager() {
        hashMap.put("CRM", new StaffA());
        hashMap.put("WORKSHEET", new StaffB());
    }

    @Override
    public void doing(String command) {
        hashMap.get(command).doing(command);
    }
}
