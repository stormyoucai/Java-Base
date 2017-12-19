package cn.yan.stopthread;

/**
 * Created by yanchongsheng on 2017/12/19.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        new Thread(my).start();

        try {
            Thread.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        my.stop();
    }
}
