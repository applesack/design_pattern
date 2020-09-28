package 设计模式_结构型.装饰者.v1;

public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc()+"加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
