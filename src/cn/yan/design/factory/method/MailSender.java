package cn.yan.design.factory.method;

/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("This is mail send");
    }
}
