package 设计模式_行为型.模板方法;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月05日 10:29
 */
public class FECourse extends ACourse {

    private boolean needWriteArticleFlag = false;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
