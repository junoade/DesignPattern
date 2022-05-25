package lecture.week12.decorator_01;

public class CarDecorator implements Car{
    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }
}
