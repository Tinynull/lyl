package proxyTest.staticProxy;

/**
 * 亮哥相当于一个代理者.
 *
 * @ClassName LiangGe.
 * Create by Null on 2019/1/5/22:19
 **/
public class LiangGe {

    private Recreation recreation;

    public LiangGe(Recreation recreation) {
        this.recreation = recreation;
    }

    public void lookForBathCenter() {
        System.out.println("亮哥根据我的需要找一个洗浴中心");
        recreation.goBathCenter();
        System.out.println("不知道有没有找到");
    }

    public void lookForClub() {
        System.out.println("亮哥根据我的需求找一个会所");
        recreation.goClub();
        System.out.println("亮哥老司机，一下子就找到了");
    }

    public void goShopping() {
        String name = "一盒杜蕾斯";
        int money = 69;
        recreation.goShopping(name, money);
    }

}
