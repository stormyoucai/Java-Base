package cn.yan.design.singleton;

/**
 * Created by yanchongsheng on 2017/12/21.
 */

/**
 * 该类目前毫无线程安全的保护
 * 首先会想到对getInstance方法加synchronized关键字
 * 但是，synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，
 * 因为每次调用getInstance()，都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了
 * 所以,改进如下
 *
 * 但是：在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();
 * 语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，所以就有可能拿到赋值但是没有实例化的对象去使用，然后报错了
 * 改进:
 * 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
 */
public class Singleton {
    //内部类
    /*private static class SingletonFactory{
        private static Singleton instance = new Singleton();

        public static Singleton getInstance() {
            return SingletonFactory.instance;
        }
    }*/

    //持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
    private static Singleton instance = null;

    //私有构造方法，防止被实例化
    private Singleton() {

    }

    //静态工程方法，创建实例
    public static Singleton getInstance() {
        //只对instance为null，并创建对象的时候才需要加锁
        if (instance == null) {
            synchronized (instance) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    //如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve() {
        return instance;
    }
}
