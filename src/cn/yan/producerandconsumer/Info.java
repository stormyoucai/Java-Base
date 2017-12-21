package cn.yan.producerandconsumer;

/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class Info {
    private String name = "ycs";
    private String content = "man";
    private boolean flag = false;

    public synchronized void set() {
        if (!flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        this.setName("ycs");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setContent("man");
        flag = false;
        notify();
    }

    public synchronized  void get() {
        if(flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " " + this.getContent());
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
