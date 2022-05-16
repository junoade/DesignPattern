package lecture.week11.template_method;

public class ClientTest {
    public static void main(String[] args){
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();
        coffee.prepareRecipe(); // 더 높은 수준의 클래스에서 저 수준의 클래스의 구현을 호출,
        tea.prepareRecipe();
    }
}
