package 创建型模式.建造者模式;

public abstract class MealBuilder {
    public abstract void bulidFood();
    public abstract void bulidDrink();
    public abstract Meal getMeal() ;
}
