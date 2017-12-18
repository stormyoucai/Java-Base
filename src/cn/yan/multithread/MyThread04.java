package cn.yan.multithread;

/**
 * Created by yanchongsheng on 2017/12/18.
 */
public class MyThread04 extends Thread{
    private int ticket = 5;

    public void run() {
        for (int i = 0; i < 100; i ++){
            if (ticket > 0) {
                System.out.println("卖票" + ticket --);
            }
        }
    }
}
