package 设计原则.里氏替换原则;

//长方形
public class Rectangle {

    private long lenght;
    private long width;

    public long getLenght() {
        return lenght;
    }

    public void setLenght(long lenght) {
        this.lenght = lenght;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
