package cn.yan.design.factory.abstracts;

/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class PhoneSenderFactory implements Factory {
    @Override
    public Sender produce() {
        return new PhoneSender();
    }
}
