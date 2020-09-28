package 设计模式_行为型.策略模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 15:46
 */
public class LijianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
