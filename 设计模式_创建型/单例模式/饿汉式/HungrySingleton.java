package 单例模式.饿汉式;

import java.io.Serializable;

//在类加载的时候就完成了初始化，优点是简单，没有延迟加载的浪费
public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton;


    static {
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton() {

    }
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
}
