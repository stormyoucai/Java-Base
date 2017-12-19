package cn.yan.threaddemo;

/**
 * Created by yanchongsheng on 2017/12/19.
 */

/**
 * 出现了内容不对应的问题，使用同步解决问题
 */
public class ThreadCaseDemo01 {
    public static void main(String[] args) {
        Info info = new Info();
        Producer pro = new Producer(info);
        Consumer con = new Consumer(info);

        new Thread(pro).start();
        new Thread(con).start();
    }
}
