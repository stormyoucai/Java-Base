package cn.yan.design.factory.many;

/**
 * Created by yanchongsheng on 2017/12/21.
 */

/**
 * 工厂方法设计模式：多个工厂方法模式
 * 对普通工厂方法模式的改进，提供了多个工厂方法，分别创建对象
 * (创建的对象的类型由方法决定)，避免了传入字符串出错的问题
 */

public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.producerMail();
        sender.send();
    }
}
