package 设计模式_创建型.单例模式.懒汉式;

public class T implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+""+instance);
    }
}
