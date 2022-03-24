package lecture.week3.problem04_ISP;

public abstract class Toy {
    double price;
    String color;

    /* 장난감 BaseType을 상속받는 SubType마다 price 측정, color 색칠 등을 다양하게 다를 수 있게 끔 */
    abstract void setPrice(double price);
    abstract void setColor(String color);
}
