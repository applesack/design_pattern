package 命令模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 17:31
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name+"视频课程开放");
    }

    public void close() {
        System.out.println(this.name+"视频课程关闭");
    }
}
