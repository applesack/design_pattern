package 设计模式_结构型.适配器模式.classdapter;

public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarger = new Adapter();
        adapterTarger.request();
    }
}
