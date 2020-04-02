package 适配器模式.objectadapter;

public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreTagert目标方法");
    }
}
