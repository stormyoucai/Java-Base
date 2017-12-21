package cn.yan.serializable;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/21.
 */

/**
 * MySerilizable 是一个简单的序列化程序，
 * 它先将一个Person对象保存到文件person.txt中，
 * 然后再从该文件中读出被存储的Person对象，并打印该对象。
 */
public class MySerializablePerson {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("E:" + File.separator + "person.txt");

        //序列化持久对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        Person per = new Person("Ycs",25);
        out.writeObject(per);
        out.close();

        //反序列化得到对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Object person = in.readObject();    //没有强制转换到Person
        in.close();
        //结果没有打印“无参构造”，说明反序列化机制无需通过构造器来初始Java对象。
        System.out.println(person);
    }
}
