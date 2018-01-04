package cn.yan.producer;

/**
 * Created by yanchongsheng on 2018/1/4.
 */
public class Consumer implements Runnable{
    private Info info;

    public Consumer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i=0;i<50;i++) {
            this.info.get();
        }
    }
}
