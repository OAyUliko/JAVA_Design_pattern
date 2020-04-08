package 结构型模式.装饰模式;

public class Decorate implements BirthdayCake {
    private BirthdayCake birthdayCake;

    public Decorate(BirthdayCake birthdayCake) {
        this.birthdayCake = birthdayCake;
    }
    @Override
    public void show() {
        birthdayCake.show();//因为不知道具体怎么装饰，所以给派生类去show
        System.out.println("抽象装饰类里的show");
    }
}
