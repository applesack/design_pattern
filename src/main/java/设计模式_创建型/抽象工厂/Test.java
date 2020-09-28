package 设计模式_创建型.抽象工厂;

public class Test {
    public static void main(String[] args) {

        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();

        video.produce();
        article.produce();
        System.out.println();
    }
}
