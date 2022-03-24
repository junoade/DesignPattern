package lecture.week3.problem04_ISP;

public class ToyPlane extends Toy implements Flyable {

    @Override
    public void fly() {
        System.out.println("Toy Plane is Moving.. Wing Wing");
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
