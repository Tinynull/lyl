package prototypeTest;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DeepCloneTest.
 * Create by Null on 2019/1/5/14:59
 **/
public class DeepCloneTest implements Serializable {


    /**
     * 引用传递与深度复制
     *
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static void demo1() throws ClassNotFoundException, IOException {

        System.out.println("===========未使用深度复制=========");
        Condom condom1 = new Condom();
        condom1.setName("杜蕾斯");
        condom1.setPrice(58.00);
        Condom condom2 = condom1;
        condom1.setName("第六感");
        condom1.setPrice(38.00);
        System.out.println("condom1 : " + condom1);
        System.out.println("condom2(引用传递) : " + condom2);

        System.out.println("===========使用深度复制=========");
        Condom condom = new Condom();
        condom.setName("杜蕾斯");
        condom.setPrice(58.00);
        Condom cloneObject = (Condom) DeepClone.Condom(condom);
        cloneObject.setName("第六感");
        cloneObject.setPrice(38.00);

        System.out.println("condom:" + condom);
        System.out.println("cloneObject:" + cloneObject);
    }

    /**
     * 集合的值复制与深度复制
     *
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static void demo2() throws ClassNotFoundException, IOException {
        System.out.println("===========未使用深度复制=========");
        //创建Condom对象
        Condom condom = new Condom();
        condom.setName("杜蕾斯");
        List<Condom> list1 = new ArrayList<Condom>();
        list1.add(condom);

        //未使用深度复制
        List<Condom> list2 = new ArrayList<Condom>(list1);//这里与使用Collections.copy(dest, src)结果一样
        //改变list1中元素的值
        for (Condom d1 : list1) {
            //改变dc1里i的值
            condom.setName("第六感");
        }
        //遍历list1
        for (Condom condom1 : list1) {
            System.out.println("name : " + condom1.getName());
        }
        //遍历list2
        for (Condom condom2 : list2) {
            System.out.println("list2(复制） : " + condom2.getName());
        }


        System.out.println("===========使用深度复制后=========");
        Condom condom1 = new Condom();
        condom1.setName("杜蕾斯");
        List<Condom> list3 = new ArrayList<Condom>();
        list3.add(condom1);
        List<Condom> list4 = (List<Condom>) DeepClone.Condom(list3);

        for (Condom condom2 : list3) {
            //改变dc3里i的值
            condom2.setName("第六感");
        }

        for (Condom condom3 : list3) {
            System.out.println("condom3 : " + condom3.getName());
        }

        for (Condom condom4 : list4) {
            System.out.println("list4(深度复制）: " + condom4.getName());
        }
    }

    /**
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        demo1();
        demo2();
    }
}
