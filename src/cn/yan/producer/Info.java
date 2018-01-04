package cn.yan.producer;

/**
 * Created by yanchongsheng on 2018/1/4.
 */
public class Info {
    private String name;
    private String content;
    private boolean flag = false;

    public synchronized void set(String name, String content) {
        if (!flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(90);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setContent(content);
        flag = false;
        super.notify();
    }

    public synchronized void get() {
        if (flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName() + "->" + this.getContent());
        flag = true;
        super.notify();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
