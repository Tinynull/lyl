package prototypeTest;

import java.io.Serializable;

/**
 * 避孕套实体类对象.
 *
 * @ClassName Condom.
 * Create by Null on 2019/1/5/11:12
 **/

public class Condom implements Serializable {

    /**
     * 名称.
     */
    private String name;

    /**
     * 单价.
     */
    private Double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Condom{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
