package 设计模式_结构型.代理模式.staticproxy;

import 设计模式_结构型.代理模式.Order;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月04日 10:19
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
