package 设计模式_行为型.责任链模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 22:38
 */
public class Test {

    public static void main(String[] args) {
        Approver articleApprover = new AritleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("JAVA设计模式精讲");
        course.setArticle("JAVA设计模式精讲的手记");
//        course.setVideo("JAVA设计模式精讲的视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
