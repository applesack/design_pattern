package 设计模式_结构型.外观模式;

public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验"+pointsGift.getName()+""+"积分资格,通过,库存资格通过");
        return true;
    }
}
