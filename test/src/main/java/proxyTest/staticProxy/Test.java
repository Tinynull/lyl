package proxyTest.staticProxy;

/**
 * 静态代理测试类.
 *
 * @ClassName Test.
 * Create by Null on 2019/1/5/22:25
 * <p>
 * lookForBathCenter:让亮哥去找洗浴中心({@link Recreation})
 * lookForClub:让亮哥去找会所({@link Recreation})
 * goShopping:让亮哥去买套({@link Recreation})
 **/
public class Test {

    public static void main(String[] args) {

        LiangGe liangGe = new LiangGe(new YunBiao());
        liangGe.lookForBathCenter();
        System.out.println();

        liangGe.lookForClub();
        System.out.println();

        liangGe.goShopping();
    }
}
