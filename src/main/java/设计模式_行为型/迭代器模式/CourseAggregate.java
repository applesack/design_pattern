package 设计模式_行为型.迭代器模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 11:07
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseAggregateImpl getCourseIterator();
}
