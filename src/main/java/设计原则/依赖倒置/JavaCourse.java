package 设计原则.依赖倒置;

public class JavaCourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("学习JAVA");
    }
}
