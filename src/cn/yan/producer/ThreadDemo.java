package cn.yan.producer;

/**
 * Created by yanchongsheng on 2018/1/4.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Info info = new Info();
        Producer producer = new Producer(info);
        Consumer consumer = new Consumer(info);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
