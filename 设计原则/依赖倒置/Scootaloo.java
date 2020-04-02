package 依赖倒置;

public class Scootaloo {

    private ICourse iCourse;

    public Scootaloo() {
        this.iCourse = null;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study() {
        iCourse.studyCourse();
    }
}
