package 结构型模式.装饰模式;

public class Cream extends Decorate {
    public Cream(BirthdayCake birthdayCake) {
        super(birthdayCake);
    }
    public void PutCream()
    {
        System.out.println("加上奶油");
    }
}
