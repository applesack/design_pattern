package 设计模式_结构型.组合模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月02日 10:28
 */
public class Course extends CatalogComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Cource Name:"+name+" Price:"+price);
    }
}
