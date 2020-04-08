package 创建型模式.建造者模式;

public class Client {
    public static void main(String[] args)
    {
        MealBuilder mb=new BMealBuilder();//得到所需的套餐
        Waiter waiter=new Waiter();//创建服务员
        waiter.setMealBuilder(mb);//服务员把套餐传递给Builder制作
        Meal meal=waiter.construct();//服务员获得套餐
        System.out.println("这个套餐有"+meal.getFood()+meal.getDrink());
    }
}
