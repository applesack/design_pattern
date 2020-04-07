package 中介者模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 22:00
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMesage(this, message);
    }
}
