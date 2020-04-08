package 结构型模式.装饰模式;

public class Client {
    public static void main(String[] args) {
        BirthdayCake birthdayCake = new Cake();//创建一个蛋糕胚
        birthdayCake.show();
        Cream cream=new Cream(birthdayCake);//蛋糕上加奶油
        cream.PutCream();
        Fruit fruit=new Fruit(cream);//在 已经加上奶油的蛋糕胚 上加水果
        fruit.PutFruit();
    }
}
