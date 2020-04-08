package 创建型模式.工厂方法模式;

public class BFactroy extends Factroy {
    public Fruit CreatFruit() {
        return new Bananan();
    }
}
