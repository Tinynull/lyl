package prototypeTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName DeepClone.
 * Create by Null on 2019/1/5/13:51
 **/
public class DeepClone {


    /**
     * 深度复制，实参类必须实现Serializable接口
     *
     * @param o
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object Condom(Object o) throws IOException, ClassNotFoundException {
//		//先序列化，写入到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(o);
        //然后反序列化，从流里读取出来，即完成复制
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();
    }

}
