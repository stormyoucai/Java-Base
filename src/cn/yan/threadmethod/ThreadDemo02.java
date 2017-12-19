package cn.yan.threadmethod;

/**
 * Created by yanchongsheng on 2017/12/19.
 */

/**
 * 程序运行结果中显示除了main线程
 * 程序主方法——通过线程对象——调用里面的run方法，所以输出结果包含了main，来源于myThread01.run();
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        MyThread01 myThread01 = new MyThread01();

        new Thread(myThread01,"线程").start();
        myThread01.run();
    }
}
