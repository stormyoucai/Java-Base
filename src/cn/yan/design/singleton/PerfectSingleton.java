package cn.yan.design.singleton;

/**
 * Created by yanchongsheng on 2017/12/22.
 */
public class PerfectSingleton {
    private PerfectSingleton() {
    }

    public static class SingletonFactory {
        private static PerfectSingleton instance = new PerfectSingleton();
    }

    public static PerfectSingleton getInstance() {
        return SingletonFactory.instance;
    }

    public Object readResolve() {
        return getInstance();
    }

}
