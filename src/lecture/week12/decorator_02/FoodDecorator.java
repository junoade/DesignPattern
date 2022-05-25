package lecture.week12.decorator_02;

public class FoodDecorator implements Food {

    Food food; // Super의 food를 참조

    FoodDecorator(Food food){
        this.food = food;
    }

    @Override
    public String order() {
        return food.order();
    }

    @Override
    public double price() {
        return food.price();
    }
}
