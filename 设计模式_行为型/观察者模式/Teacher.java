package 观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 10:01
 */
public class Teacher implements Observer {

    private String teachName;

    public Teacher(String teachName) {
        this.teachName = teachName;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teachName+"老师的"+course.getCourseName()
                +"课程接收到一个"+question.getUserName()+"提交的问答: "+question.getQuestionContent());
    }
}
