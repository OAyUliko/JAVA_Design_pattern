package 创建型模式.建造者模式;

public class Waiter {
    public MealBuilder mb;

    public void setMealBuilder(MealBuilder mb) {
        this.mb=mb;
    }

    public Meal construct() {
        mb.bulidDrink();
        mb.bulidFood();
        return mb.getMeal();
    }
}
