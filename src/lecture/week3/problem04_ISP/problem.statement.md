
객체지향 설계 원리 - ISP, Interface Segregation Principle

- 다음과 같은 인터페이스가 있고, 
```java
public interface Toy {
    void setPrice(double price);
    void setColor(String color);
    void move();
    void fly();
}
```
- ToyHouse를 다음과 같이 작성했다면, 어떤 문제가?
```java
public class ToyHouse implements Toy {
    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void move(){}
    
    @Override
    public void fly(){}

}

```