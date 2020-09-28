package 设计模式_行为型.观察者模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 10:13
 */
public class Test {

    public static void main(String[] args) {

        Course course = new Course("JAVA设计模式精讲");
        Teacher teacher = new Teacher("Alpha");

        course.addObserver(teacher);

        // 业务逻辑代码
        Question question = new Question();
        question.setUserName("Geely");
        question.setQuestionContent("JAVA的主函数如何编写？");

        course.produceQuestion(course, question);
    }
}
