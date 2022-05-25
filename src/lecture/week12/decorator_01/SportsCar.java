package lecture.week12.decorator_01;

public class SportsCar extends CarDecorator {
    SportsCar(Car car){
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of SportsCar Car. ");
    }
}
