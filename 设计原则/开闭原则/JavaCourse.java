package 开闭原则;

public class JavaCourse implements ICourse{

    private Integer Id;
    private String name;
    private Double price;

    //全参构造器 alt+Insert
    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public Double getDiscountPrice() {
        return this.price*0.8;
    }
}
