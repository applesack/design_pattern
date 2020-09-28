package 设计模式_创建型.抽象工厂;

public class JavaArticle extends Article{

    @Override
    public void produce() {
        System.out.println("编写JAVA课程手记");
    }
}
