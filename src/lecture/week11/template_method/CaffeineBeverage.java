package lecture.week11.template_method;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }
    public void boilWater(){
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    protected abstract void addCondiment();
}
