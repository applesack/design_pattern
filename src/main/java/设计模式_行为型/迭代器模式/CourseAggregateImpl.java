package 设计模式_行为型.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 11:10
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl(List courseList) {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseAggregateImpl getCourseIterator() {
        return new CourseAggregateImpl(courseList);
    }
}
