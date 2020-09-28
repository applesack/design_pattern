package 设计模式_结构型.代理模式.dynamicproxy;

import 设计模式_结构型.代理模式.IOrderService;
import 设计模式_结构型.代理模式.Order;
import 设计模式_结构型.代理模式.OrderServiceImpl;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月04日 11:22
 */
public class Test {

    public static void main(String[] args) {

        Order order = new Order();
        order.setUserId(2);

        IOrderService iOrderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        iOrderServiceDynamicProxy.saveOrder(order);
    }
}
