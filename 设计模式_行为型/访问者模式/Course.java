package 访问者模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月07日 9:26
 */
public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}
