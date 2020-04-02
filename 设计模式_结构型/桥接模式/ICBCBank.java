package 桥接模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月02日 15:47
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账号");
        account.openAccount();
        return account;
    }
}
