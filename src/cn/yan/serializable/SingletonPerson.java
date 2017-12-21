package cn.yan.serializable;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class SingletonPerson implements Serializable{

    //内部类
    private static class InstanceHolder {
        private static final SingletonPerson instance = new SingletonPerson("Ycs", 25, Gender.MALE);
    }

    public static SingletonPerson getInstance() {
        return InstanceHolder.instance;
    }

    private String name = null;

    private Integer age = null;

    private Gender gender = null;

    private SingletonPerson() {
        System.out.println("无参构造");
    }

    private SingletonPerson(String name, Integer age, Gender gender) {
        System.out.println("有参构造");
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String toString(){
        return "[" + name + " " + age + " " + gender + "]";
    }

    private Object readResolve() throws ObjectStreamException {
        return InstanceHolder.instance;
    }
}
