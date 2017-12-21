package cn.yan.design.factory.many;

/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class PhoneSend implements Sender {
    @Override
    public void send() {
        System.out.println("This is phone send");
    }
}
