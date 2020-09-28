package 设计模式_行为型.中介者模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 22:00
 */
public class Test {

    public static void main(String[] args) {
        User tom = new User("Tom");
        User bob = new User("Bob");

        tom.sendMessage("Hey! Bob! Let's learn Design Pattern.");
        bob.sendMessage("OK! Tom!");
    }
}
