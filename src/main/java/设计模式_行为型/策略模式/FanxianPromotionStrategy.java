package 设计模式_行为型.策略模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 15:46
 */
public class FanxianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放在慕课网的余额中");
    }
}
