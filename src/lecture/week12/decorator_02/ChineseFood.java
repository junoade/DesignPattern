package lecture.week12.decorator_02;

public class ChineseFood extends FoodDecorator {

    ChineseFood(Food food) {
        super(food);
    }

    @Override
    public String order() {
        return super.order() + " With Fried Rice and Manchurian";
    }

    @Override
    public double price() {
        return super.price() + 65.0;
    }
}
