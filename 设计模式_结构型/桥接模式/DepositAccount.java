package 桥接模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月02日 15:36
 */
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
