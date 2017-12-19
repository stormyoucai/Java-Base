package cn.yan.threadmethod;

/**
 * Created by yanchongsheng on 2017/12/19.
 */
public class ThreadTestDemo01 {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("A",1000);
        HelloThread h2 = new HelloThread("B",2000);
        HelloThread h3 = new HelloThread("C",3000);

        h1.start();
        h2.start();
        h3.start();
    }
}

class HelloThread extends Thread{
    private int time;

    public HelloThread(String name,int time) {
        super(name);
        this.time = time;
    }

    public void run() {
        try {
            Thread.sleep(this.time);
            System.out.println("线程 " + Thread.currentThread().getName()  + " 运行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

