package 设计模式_创建型.原型模式.abstractprototype;

public class B extends A {

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }
}
