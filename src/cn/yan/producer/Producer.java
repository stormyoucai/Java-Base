package cn.yan.producer;

/**
 * Created by yanchongsheng on 2018/1/4.
 */
public class Producer implements Runnable{
    private Info info;

    public Producer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        boolean flag = false;
        for (int i=0;i<50;i++) {
            if (flag) {
                this.info.set("你", "好");
                flag = false;
            }else {
                this.info.set("ni", "hao");
                flag = true;
            }
        }
    }
}
