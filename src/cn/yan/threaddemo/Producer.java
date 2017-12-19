package cn.yan.threaddemo;

/**
 * Created by yanchongsheng on 2017/12/19.
 */
public class Producer implements Runnable{
    private Info info = null;

    public Producer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        boolean flag = false;
        for(int i=0; i< 50; i++) {
            if(flag) {
                this.info.set("ycs","man");
                flag = false;
            } else {
                this.info.set("闫重胜","男");
                flag = true;
            }
        }
    }
}
