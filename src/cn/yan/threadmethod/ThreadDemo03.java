package cn.yan.threadmethod;

/**
 * Created by yanchongsheng on 2017/12/19.
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        MyThread01 mt = new MyThread01();
        Thread t = new Thread(mt,"线程");

        System.out.println("开始之前 " + t.isAlive());
        t.start();
        System.out.println("开始之后 " + t.isAlive());

        for(int i = 0; i<3; i++) {
            System.out.println("main运行 " + i);
        }

        //以下的输出结果不确定
        System.out.println("代码执行之后" + t.isAlive()); //可为true或者false
    }
}
