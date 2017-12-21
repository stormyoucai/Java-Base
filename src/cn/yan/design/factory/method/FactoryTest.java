package cn.yan.design.factory.method;

/**
 * Created by yanchongsheng on 2017/12/21.
 */

/**
 * 工厂方法设计模式：普通工厂模式
 * 建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * (创建的对象的类型由传入的字符串决定)
 */

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.producer("phone");
        sender.send();
    }
}
