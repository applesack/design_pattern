package 设计模式_结构型.代理模式.staticproxy;

import 设计模式_结构型.代理模式.IOrderService;
import 设计模式_结构型.代理模式.Order;
import 设计模式_结构型.代理模式.OrderServiceImpl;
import 设计模式_结构型.代理模式.db.DataSourceContextHolder;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月03日 20:45
 */
public class OrderServiceStaticProxy {

    // 目标对象
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);

        afterMethod();

        return result;
    }

    private void beforeMethod(Order order) {

        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        // todo 设置dataSource;
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
