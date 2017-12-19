package cn.yan.threadmethod;

/**
 * Created by yanchongsheng on 2017/12/19.
 */
public class ThreadTestDemo02 {
    public static void main(String[] args) {
        HelloThread02 h1 = new HelloThread02("A",1000);
        HelloThread02 h2 = new HelloThread02("B",2000);
        HelloThread02 h3 = new HelloThread02("C",3000);

        new Thread(h1).start();
        new Thread(h2).start();
        new Thread(h3).start();
    }
}

class HelloThread02 implements Runnable{
    private String name;
    private int time;

    public HelloThread02(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + " 运行 " + this.time);
    }
}
