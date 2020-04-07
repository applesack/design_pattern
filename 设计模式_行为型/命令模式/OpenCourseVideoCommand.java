package 命令模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 17:33
 */
public class OpenCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
