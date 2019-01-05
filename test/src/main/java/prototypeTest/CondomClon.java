package prototypeTest;

import java.io.Serializable;

/**
 * @ClassName CondomClon.
 * Create by Null on 2019/1/5/13:52
 **/
public class CondomClon implements Serializable {
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
