package 设计原则.里氏替换原则;

public class Test {

    public static void resize(Rectangle rectangle) {

        //
        while (rectangle.getWidth() <= rectangle.getLenght()) {
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width: "+rectangle.getLenght()+
                    " lenght: "+rectangle.getLenght());
        }

        System.out.println("resize 方法结束");
        System.out.println("width: "+rectangle.getWidth()+", lenght: "+rectangle.getLenght());
    }

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLenght(20);
//        resize(rectangle);

        Square square = new Square();
        square.setSideLenght(10);
        resize(square);
    }
}
