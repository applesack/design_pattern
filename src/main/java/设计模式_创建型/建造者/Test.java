package 设计模式_创建型.建造者;

public class Test {
    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java视频",
                "Java手记",
                "Java问答");
        System.out.println(course);
    }
}
