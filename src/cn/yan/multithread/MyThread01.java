package cn.yan.multithread;

/**
 * Created by yanchongsheng on 2017/12/18.
 */
public class MyThread01 extends Thread{
    private String name;

    public MyThread01(String name) {
        this.name = name;
    }

    public void run(){
        for(int i = 0;i < 10; i ++) {
            System.out.println(name + " " + i);
        }
    }
}
