package cn.yan.design.factory.method;

/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class SendFactory {
    public Sender producer(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        }else if ("phone".equals(type)) {
            return new PhoneSend();
        }else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
