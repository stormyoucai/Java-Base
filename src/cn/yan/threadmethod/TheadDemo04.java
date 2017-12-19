package cn.yan.threadmethod;

/**
 * Created by yanchongsheng on 2017/12/19.
 */
public class TheadDemo04 {
    public static void main(String[] args) throws InterruptedException {
        MyThread01 mt = new MyThread01();
        Thread t = new Thread(mt);
        t.start();

        for(int i = 0;i<50;i++) {
            if (i > 10){
                t.join();
            }
            System.out.println("main " + i);
        }
    }
}
