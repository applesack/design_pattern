package 代理模式.dynamicproxy;

import 代理模式.Order;
import 代理模式.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月04日 11:04
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before code");

        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");

        // todo 设置dataSource;
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("动态代理 after code");
    }
}
