package cn.yan.serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class Person implements Serializable{
    private String name = null;
    transient private Integer age = null;

    public Person() {
        System.out.println("no parameters constructor");
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + age + "]";
    }

    //自定义序列化
    private void writeObject(ObjectOutputStream out) throws IOException {
        // out.defaultWriteObject();  // 将当前类的非静态和非瞬态字段写入此流。
        //如果不写，如果还有其他字段，则不会被序列化

        //将name简单加密（反转），这样别人就知道是怎么回事，当然实际应用不可能这样加密。
        out.writeObject(new StringBuffer(name).reverse());
        out.writeInt(age);
    }

    //自定义反序列化
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        //in.defaultReadObject();// 从此流读取当前类的非静态和非瞬态字段。
        //如果不写，其他字段就不能被反序列化

        name = ((StringBuffer)in.readObject()).reverse().toString();
        age = in.readInt();
    }
}















