package 外观模式;

public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        //物流系统的对接逻辑
        System.out.println("进入物流系统");
        String shippingOrderNo = "1234567";

        return shippingOrderNo;
    }
}
