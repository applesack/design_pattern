package 设计模式_结构型.代理模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月03日 20:33
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {

        // spring会自动注入，这里用new模拟spring的注入
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");

        return iOrderDao.insert(order);
    }
}
