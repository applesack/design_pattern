package 设计模式_行为型.访问者模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月07日 9:40
 */
public class Visitor implements IVisitor {

    // 访问免费课程，打印所有免费课程
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程:" + freeCourse.getName());
    }

    // 访问实战课程，打印所有实战课程
    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程:" + codingCourse.getName());
    }
}
