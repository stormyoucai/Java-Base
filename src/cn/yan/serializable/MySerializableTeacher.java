package cn.yan.serializable;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/21.
 */

/**
 * 分析其打印结果发现：
 * Externalizable接口：还是调用了无参构造
 */
public class MySerializableTeacher {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("E:" + File.separator + "person.txt");

        //序列化持久对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        Teacher ter = new Teacher("Ycs",25);
        out.writeObject(ter);
        out.close();

        //反序列化得到对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Object teacher = in.readObject();    //没有强制转换到Person
        in.close();
        //结果没有打印“无参构造”，说明反序列化机制无需通过构造器来初始Java对象。
        System.out.println(teacher);
    }
}
