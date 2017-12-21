package cn.yan.serializable;

import java.io.*;

/**
 * Created by yanchongsheng on 2017/12/21.
 */

/**
 * 从文件中获取的SingletonPerson对象与SingletonPerson类中的单例对象并不相等。
 * 为了能在序列化过程仍能保持单例的特性，可以在Person类中添加一个readResolve()方法，在该方法中直接返回SingletonPerson的单例对象
 *
 * 无论是实现Serializable接口，或是Externalizable接口，当从I/O流中读取对象时，
 * readResolve()方法都会被调用到。实际上就是用readResolve()中返回的对象直接替换在反序列化过程中创建的对象，
 * 而被创建的对象则会被垃圾回收掉。
 */
public class MySerializableSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("E:" + File.separator + "test.txt");

        //序列化持久对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(SingletonPerson.getInstance()); //保存单例对象
        out.close();

        //反序列化得到对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Object singletonPerson = in.readObject();    //没有强制转换到Person
        in.close();
        //结果没有打印“无参构造”，说明反序列化机制无需通过构造器来初始Java对象。
        System.out.println(singletonPerson);

        System.out.println(SingletonPerson.getInstance() == singletonPerson); // 将获取的对象与Person类中的单例对象进行相等性比较
    }
}
