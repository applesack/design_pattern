package 设计模式_创建型.单例模式.懒汉式;

//懒汉式
public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private LazySingleton() {

    }
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
