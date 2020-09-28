package 设计模式_行为型.访问者模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月07日 9:28
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
