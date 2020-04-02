package 桥接模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月02日 15:40
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
