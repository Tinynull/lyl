package proxyTest.staticProxy;

/**
 * 运彪这个人.
 *
 * @ClassName YunBiao.
 * Create by Null on 2019/1/5/22:13
 **/
public class YunBiao implements Recreation {
    /**
     * 实现的接口.
     */
    @Override
    public void goBathCenter() {
        System.out.println("条件：需要有年轻貌美且胸大腿长腰细的小姐姐服务的洗浴中心");
    }

    /**
     * 实现的接口.
     */
    @Override
    public void goClub() {
        System.out.println("条件:需要有嫩模全套服务的会所，而且价格不太贵");
    }

    /**
     * 买东西.
     *
     * @param name  物品名称
     * @param money 花了多少钱
     */
    @Override
    public void goShopping(String name, int money) {
        System.out.println("亮哥帮我买了" + name + "共花了" + money + "钱");
    }

}
