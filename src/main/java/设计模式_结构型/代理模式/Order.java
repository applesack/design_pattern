package 设计模式_结构型.代理模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月03日 20:29
 */
public class Order {

    private Object orderInfo;
    private Integer userId;



    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
