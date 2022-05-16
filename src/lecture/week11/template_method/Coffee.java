package lecture.week11.template_method;

public class Coffee extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding Sugar and Milk");
    }
}
