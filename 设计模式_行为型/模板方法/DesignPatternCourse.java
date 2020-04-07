package 模板方法;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 10:28
 */
public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
