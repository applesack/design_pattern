package 设计模式_创建型.原型模式.abstractprototype;

public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
