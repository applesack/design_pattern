package 设计原则.依赖倒置;

public class FECourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习前端");
    }
}
