package 里氏替换原则;

//正方形
public class Square  extends Rectangle{

    private long sideLenght;

    public long getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(long sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public long getLenght() {
        return getSideLenght();
    }

    @Override
    public void setLenght(long lenght) {
        setSideLenght(lenght);
    }

    @Override
    public long getWidth() {
        return getSideLenght();
    }

    @Override
    public void setWidth(long width) {
        setSideLenght(width);
    }
}
