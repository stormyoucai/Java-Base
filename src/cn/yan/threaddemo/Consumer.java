package cn.yan.threaddemo;

/**
 * Created by yanchongsheng on 2017/12/19.
 */
public class Consumer implements Runnable{
    private Info info = null;

    public Consumer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for(int i = 0; i < 50; i ++) {
            this.info.get();
        }
    }
}
