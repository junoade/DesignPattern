package lecture.week12.decorator_02;

public class NonVegFood extends FoodDecorator {

    NonVegFood(Food food) {
        super(food);
    }

    @Override
    public String order() {
        return super.order() + " With Roasted Chicken and Chicken Curry";
    } // NonVegFood의 주문 내용에 알맞게 덧붙인다.

    @Override
    public double price() {
        return super.price() + 150.0;
    } // NonVegFood의 가격에 알맞게 덧붙인다.
}
