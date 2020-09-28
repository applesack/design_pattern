package 设计模式_结构型.桥接模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月02日 15:46
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
