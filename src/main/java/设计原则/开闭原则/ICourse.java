package 设计原则.开闭原则;


//课程 接口
public interface ICourse {

    //获取 id 名称 价格
    Integer getId();
    String getName();
    Double getPrice();

    //新增 获取打折价格
    Double getDiscountPrice();
}
