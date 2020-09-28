package 设计模式_行为型.模板方法;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 10:22
 */
public abstract class ACourse {

    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (this.needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }
    final void makeVideo() {
        System.out.println("制作视频");
    }
    final void writeArticle() {
        System.out.println("编写手记");
    }

    // 钩子方法
    protected boolean needWriteArticle() {
        return false;
    }
    abstract void packageCourse();
}
