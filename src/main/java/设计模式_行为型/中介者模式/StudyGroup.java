package 设计模式_行为型.中介者模式;

import java.util.Date;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 21:59
 */
public class StudyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "["+user.getName() + "] : " + message);
    }
}
