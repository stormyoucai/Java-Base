package cn.yan.multithread;

/**
 * Created by yanchongsheng on 2017/12/18.
 */

//从执行效果看，A、B交替执行，哪个线程先抢到cpu资源，哪个线程就执行，达到了并发效果
public class ThreadDemo02 {
    public static void main(String[] args) {
        MyThread01 myThread1 = new MyThread01("线程A");
        MyThread01 myThread2 = new MyThread01("线程B");

        myThread1.start();
        myThread2.start();
    }
}
