package cn.yan.multithread;

/**
 * Created by yanchongsheng on 2017/12/18.
 */
public class ThreadDemo04 {
    public static void main(String[] args) {
        MyThread04 m1 = new MyThread04();
        MyThread04 m2 = new MyThread04();
        MyThread04 m3 = new MyThread04();

        m1.run();
        m2.run();
        m3.run();
    }
}
