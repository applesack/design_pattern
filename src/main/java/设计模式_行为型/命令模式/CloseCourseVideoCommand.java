package 设计模式_行为型.命令模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 17:33
 */
public class CloseCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
