package 桥接模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月02日 15:37
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
