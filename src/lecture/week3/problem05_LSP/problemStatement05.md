### 다음 코드를 실행 시켰을 때 생길 수 있는 문제점을 찾고 어떤 SOLID 원리를 위반했는지 찾아보자.
```java
public class Rectangle {

    private int height;

    private int width;

    public Rectangle(int height, int width) {

        this.height = height;

        this.width = width;

    }

    public int getHeight() {

        return this.height;

    }

    public void setHeight(int height) {

        this.height = height;

    }

    public int getWidth() {

        return this.width;

    }

    public void setWidth(int width) {

        this.width = width;

    }

}

public class Square extends Rectangle {

    public Square(int size) {

        super(size, size);

    }

    public int getHeight() {

        return super.height;

    }

    public int getWidth() {

        return super.width;

    }

}

```

### 실행 시 생길 수 있는 문제점은?
첫째, 주어진 코드의 Square 클래스에서 default constructor를 생성하지 않아, 주어진 테스트 코드로는 실행할 수 없다.

둘째, 주어진 코드의 Square 클래스에서 getter() 부분의 super.height와 super.width에 접근이 불가능하다. 따라서 super.getHeight(); super.getWidth(); 와 같이 수정할 필요가 있다.

셋째, 만약 new Square(n); (n은 정수형 literal)과 같이 수정하고 getter 부분도 작성하여 그 이외의 코드를 정상적으로 작성하였다고 할 때, Rectangle클래스의 서브 클래스 Square의 생성자로 생성되면,
가로와 높이가 다르다는 직사각형의 정의에 부합하지 않는다는 문제가 있다. 따라서 추후 상위 클래스인 Rectangular클래스에 대해 작성된 단위 테스트, 관련된 의존되는 모듈들에 대해서 오작동을 일으킬 수 있다.


### 어떤 SOLID 원칙 위배?
이러한 문제가 발생한 이유는 부모 클래스인 Rectangle이 서브 클래스인 Square로 치환되면 의미가 달라지는 문제가 있기 때문이다. 
이는 리스코프 교체의 원리를 위반하였다. 따라서 이 둘은 서로 상속을 받으면 안된다.

### 나의 솔루션
```java
public abstract class Shape {
abstract int getArea();
}

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

public Rectnagle(){
	this(0,0);
}

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
   
    public int getArea(){
        return this.height * this.width;
    }
}


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

    public int getArea(){
        return size * size;
    }
}


```