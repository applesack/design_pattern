package 访问者模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月07日 9:24
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
