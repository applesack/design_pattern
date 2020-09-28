package 设计模式_行为型.责任链模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月06日 22:25
 */

// 批准者
public abstract class Approver {

    // 包含一个同类型的对象, 可以是继承本类的子类
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
