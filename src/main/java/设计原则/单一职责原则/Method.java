package 设计原则.单一职责原则;

public class Method {

    private void updateUserInfo(String userName, String address) {
        userName = "";
        address = "";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "";

    }

    private void updateUserName(String userName) {
        userName = "";
    }

    private void updateUserAddress(String address) {
        address = "e";
    }
}
