package 建造者.v2;

public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().
                buildCourseNmae("Java设计模式精讲").
                buildCourseArticle("Java设计模式手记").
                buildCourseVideo("Java设计模式视频").build();

        System.out.println(course);
    }
}
