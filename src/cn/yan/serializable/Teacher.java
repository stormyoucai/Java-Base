package cn.yan.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class Teacher implements Externalizable{
    private String name;
    private Integer age;

    public Teacher() {
        System.out.println("no parameters constructor");
    }

    public Teacher(String name, Integer age) {
        System.out.println("have parameters constructor");
        this.name = name;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(new StringBuffer(name).reverse());//将name简单加密
        //out.writeInt(age);  //注掉这句后，age属性将不能被序化
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = ( (StringBuffer)in.readObject() ).reverse().toString();
        //age = in.readInt();
    }

    @Override
    public String toString() {
        return "[" + name + ", " + age + "]";
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
}
