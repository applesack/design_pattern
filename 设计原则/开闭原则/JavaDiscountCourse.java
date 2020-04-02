package 开闭原则;

public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOringinPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        //这里对于需要打折的产品进行处理, 重写父类的方法
        Double price = super.getPrice();

        if (price > 300)
            return price*0.8;
        if (price > 200)
            return price*0.9;
        if (price > 20)
            return price-20;

        return price;
    }
}
