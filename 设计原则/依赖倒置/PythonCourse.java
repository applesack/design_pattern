package 依赖倒置;

public class PythonCourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("Python");
    }
}
