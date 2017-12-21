package cn.yan.design.factory.abstracts;

/**
 * Created by yanchongsheng on 2017/12/21.
 */

/**
 * 为了做到对扩展开发，对修改关闭而搞出来的，抽闲工厂类
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new MailSenderFactory();
        Sender sender = factory.produce();
        sender.send();
    }
}
