package cn.yan.producerandconsumer;

/**
 * Created by yanchongsheng on 2017/12/21.
 */
public class AllDemo {
    private int product = 0;
    private final int MAX_VALUE = 1;
    private final int MIN_VALUE = 0;

    public synchronized void producer() {
        if (product >= MAX_VALUE) {
            try {
                wait();
                System.out.println("仓库已满，请等待取走");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        this.product ++;
        System.out.println("生产者生产了: " + product);
        //通知等待区的消费者，可以取走了
        notifyAll();
    }

    public synchronized void consumer() {
        if (product <= MIN_VALUE) {
            try {
                wait();
                System.out.println("缺货，请等待生产");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        System.out.println("消费者消费了第: " + product);
        product --;
        //通知生产者可以生产了
        notifyAll();
    }
}
