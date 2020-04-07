package 迭代器模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 11:09
 */
public interface CourseIterator {

    Course nextCourse();
    boolean isLastCourse();
}
