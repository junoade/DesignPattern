package lecture.week3.problem04_ISP;

public class ToyCar extends Toy implements Movable {

    @Override
    public void move() {
        System.out.println("Toy Car is Moving.. Broom Broom");
    }

    @Override
    void setPrice(double price) {
        this.price = price;
    }

    @Override
    void setColor(String color) {
        this.color = color;
    }
}
