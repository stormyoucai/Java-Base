package cn.yan.design.factory.many;


/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class SendFactory {
    public Sender producerMail() {
        return new MailSender();
    }

    public Sender producerPhone() {
        return new PhoneSend();
    }
}
