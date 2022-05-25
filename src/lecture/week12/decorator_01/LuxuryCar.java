package lecture.week12.decorator_01;

public class LuxuryCar extends CarDecorator {

    LuxuryCar(Car car){ // 부모의 생성자로 전달받은 Car를 전달
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Luxury Car. ");
    }
}
