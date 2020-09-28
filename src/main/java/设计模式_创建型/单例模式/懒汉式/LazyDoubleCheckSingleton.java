package 设计模式_创建型.单例模式.懒汉式;

//双重检查
public class LazyDoubleCheckSingleton {

    //volatile
    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton() {

    }
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存地址
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
