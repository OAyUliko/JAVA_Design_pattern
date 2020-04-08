package 创建型模式.抽象工厂模式;

public class BFactroy implements B_FruitVegetable {
    @Override
    public Fruit createF() {
        return new Bananan();
    }

    @Override
    public Vegetable createV() {
        return new Tomato();
    }
}
