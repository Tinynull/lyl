package proxyTest.dynamicStateProxy;

/**
 * @ClassName ABiao.
 * Create by Null on 2019/1/5/23:17
 **/
public class ABiao implements Proxy {
    /**
     * 买车.
     */
    @Override
    public void buyCar() {
        System.out.println("要一辆900万左右的法拉利跑车");
    }
}
