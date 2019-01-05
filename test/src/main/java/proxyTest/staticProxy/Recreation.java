package proxyTest.staticProxy;

/**
 * 娱乐接口 里面包含了娱乐的项目.
 */
public interface Recreation {

    /**
     * 去洗浴中心的接口.
     */
    void goBathCenter();

    /**
     * 去会所的接口.
     */
    void goClub();

    /**
     * 买东西.
     *
     * @param name  物品名称
     * @param money 花了多少钱
     */
    void goShopping(String name, int money);


}
