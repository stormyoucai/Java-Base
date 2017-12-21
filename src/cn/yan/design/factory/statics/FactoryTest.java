package cn.yan.design.factory.statics;

/**
 * Created by yanchongsheng on 2017/12/21.
 */

/**
 * 工厂方法设计模式：静态工厂方法模式
 * 将多个工厂方法模式里的方法设置为静态的，不需要创建实例，直接调用就行
 * (创建的对象的类型由方法决定)，避免了传入字符串出错的问题
 */

public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.producerMail();
        sender.send();
    }
}
