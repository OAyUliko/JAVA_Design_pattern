package 创建型模式.建造者模式;

public class BMealBuilder extends MealBuilder {
    private Meal meal;

    public BMealBuilder() {
        meal=new Meal();
    }
    public void bulidFood() {
        meal.setFood("米饭");
    }

    public void bulidDrink() {
        meal.setDrink("豆浆");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
