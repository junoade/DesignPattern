package lecture.week11.template_method;

public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding Lemon");
    }
}
