package 策略模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 16:36
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP =
            new HashMap<>();

    private static final PromotionStrategy NON_PROMOTIONSTRATEGY = new EmptyPromotionStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LijianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanxianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManjianPromotionStrategy());
    }

    private PromotionStrategyFactory() {
        System.out.println();
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTIONSTRATEGY : promotionStrategy;
    }

    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
