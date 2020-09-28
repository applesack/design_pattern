package 设计模式_结构型.装饰者.v2;

public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int getCost() {
        return 8;
    }
}
