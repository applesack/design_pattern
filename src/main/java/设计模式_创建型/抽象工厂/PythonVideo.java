package 设计模式_创建型.抽象工厂;

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程");
    }
}
