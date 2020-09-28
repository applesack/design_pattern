package 设计模式_创建型.单例模式.懒汉式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年09月12日 10:17
 */
public class InnerClassSingleton {

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
