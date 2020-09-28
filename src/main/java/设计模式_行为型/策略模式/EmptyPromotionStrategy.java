package 设计模式_行为型.策略模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 16:42
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}
