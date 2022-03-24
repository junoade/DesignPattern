package lecture.week3.problem05_LSP;

public class Square extends Shape{
    private int size;

    public Square(int size) {
        this.setSize(size);
    }

    public Square(){
        this(0);
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getArea() {
        return size * size;
    }
}

