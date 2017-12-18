package cn.yan.multithread;

/**
 * Created by yanchongsheng on 2017/12/18.
 */
public class MyThread02 implements Runnable{
    private String name;

    public MyThread02(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i ++) {
            System.out.println(name + " " + i);
        }
    }
}
