package 创建型模式.建造者模式;

public class AMealBuilder extends MealBuilder {
    private Meal meal;

    public AMealBuilder() {
        meal=new Meal();
    }

    public void bulidFood() {
        meal.setFood("鸡腿堡");
    }

    public void bulidDrink() {
        meal.setDrink("可乐");
    }
    public Meal getMeal() {
        return meal;
    }
}
