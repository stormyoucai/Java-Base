package cn.yan.multithread;

/**
 * Created by yanchongsheng on 2017/12/18.
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        MyThread02 myThread01A = new MyThread02("A");
        MyThread02 myThread01B = new MyThread02("B");

        Thread t1 = new Thread(myThread01A);
        Thread t2 = new Thread(myThread01B);

        t1.start();
        t2.start();
    }
}
