package cn.yan.threadmethod;

/**
 * Created by yanchongsheng on 2017/12/19.
 */

/**
 * 线程的名字
 */
public class TheadDemo01 {
    public static void main(String[] args) {
        MyThread01 myThread01 = new MyThread01();

        new Thread(myThread01).start();
        new Thread(myThread01,"线程-A").start();
        new Thread(myThread01).start();
    }
}
