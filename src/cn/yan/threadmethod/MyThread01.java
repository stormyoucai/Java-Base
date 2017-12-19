package cn.yan.threadmethod;

/**
 * Created by yanchongsheng on 2017/12/19.
 */
public class MyThread01 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 50; i ++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
