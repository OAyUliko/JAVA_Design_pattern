package 结构型模式.装饰模式;

public class Cake implements BirthdayCake {
    public Cake() {
        System.out.println("制作蛋糕胚");
    }
    @Override
    public void show() {
        System.out.println("蛋糕胚制作好了");
    }
}
