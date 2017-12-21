package cn.yan.design.factory.statics;


/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class SendFactory {
    public static Sender producerMail() {
        return new MailSender();
    }

    public static Sender producerPhone() {
        return new PhoneSend();
    }
}
