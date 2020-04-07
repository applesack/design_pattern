package 代理模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月03日 20:32
 */
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }

}
