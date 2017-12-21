package cn.yan.producerandconsumer;

/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class Consumer implements Runnable{
    private Info info = null;

    @Override
    public void run() {

        this.info.get();
    }
}
