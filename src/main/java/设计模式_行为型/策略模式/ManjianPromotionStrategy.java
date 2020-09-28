package 设计模式_行为型.策略模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 15:46
 */
public class ManjianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200元减20元");
    }
}
