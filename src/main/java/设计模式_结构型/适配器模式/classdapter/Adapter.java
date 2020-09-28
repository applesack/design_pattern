package 设计模式_结构型.适配器模式.classdapter;

public class Adapter extends Adaptee  implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
