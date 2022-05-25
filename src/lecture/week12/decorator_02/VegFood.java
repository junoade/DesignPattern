package lecture.week12.decorator_02;

public class VegFood implements Food {
    @Override
    public String order() {
        return "Veg Food";
    }

    @Override
    public double price() {
        return 50;
    }
}
