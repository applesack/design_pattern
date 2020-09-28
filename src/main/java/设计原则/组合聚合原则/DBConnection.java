package 设计原则.组合聚合原则;

public class DBConnection {

    public String getConnection() {
        return "";
    }

    public static String getString() {

        return new String("123").substring(0,2).concat("456");
    }
}
