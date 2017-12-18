package cn.yan.multithread;

/**
 * Created by yanchongsheng on 2017/12/18.
 */

//该类并没有达到并发的效果，而是A先执行，B再执行
public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread01 myThreadA = new MyThread01("线程A");
        MyThread01 myThreadB = new MyThread01("线程B");

        myThreadA.run();
        myThreadB.run();
    }
}
