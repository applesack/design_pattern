package 设计模式_结构型.适配器模式.classdapter;

public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreTagert目标方法");
    }
}
