package 设计模式_行为型.策略模式;

import org.thymeleaf.util.StringUtils;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 15:52
 */
public class Test {

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LijianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanxianPromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//    }

    public static void main(String[] args) {

        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity =
                new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
