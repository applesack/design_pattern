package 设计模式_行为型.观察者模式;

import java.util.Observable;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 9:59
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName()+"在"+course.courseName+"提交了一个问题");

        // 状态发生改变
        setChanged();
        notifyObservers(question);
    }
}
