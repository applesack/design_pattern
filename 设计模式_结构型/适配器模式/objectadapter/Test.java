package 适配器模式.objectadapter;

public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTagger = new Adapter();
        adapterTagger.request();
    }
}
