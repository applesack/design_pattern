package 观察者模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 10:00
 */
public class Question {

    private String userName;
    private String questionContent;

    public Question() {
    }

    public Question(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
