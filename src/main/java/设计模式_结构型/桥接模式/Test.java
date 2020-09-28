package 设计模式_结构型.桥接模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月02日 15:55
 */
public class Test {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ICBCBank(new SavingAccount());
        Account abcAccount = icbcBank.openAccount();
        abcAccount.showAccountType();
    }
}
