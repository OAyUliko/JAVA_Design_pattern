package 结构型模式.装饰模式;

public class Fruit extends Decorate {
    public Fruit(BirthdayCake birthdayCake) {
        super(birthdayCake);
    }

    public void PutFruit()
    {
        System.out.println("加上水果");
    }
}
