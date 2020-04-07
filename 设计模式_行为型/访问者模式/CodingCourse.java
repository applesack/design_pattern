package 访问者模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月07日 9:25
 */
public class CodingCourse extends Course {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
