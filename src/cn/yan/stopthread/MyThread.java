package cn.yan.stopthread;

/**
 * Created by yanchongsheng on 2017/12/19.
 */
public class MyThread implements Runnable{
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while(this.flag) {
            System.out.println(Thread.currentThread().getName() + " " + (i++));
        }
    }

    public void stop(){
        this.flag = false;
    }
}
