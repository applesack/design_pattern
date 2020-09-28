package 设计模式_行为型.模板方法;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 10:36
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end---");

        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end---");
    }
}
