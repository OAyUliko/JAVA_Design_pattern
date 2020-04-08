package 创建型模式.抽象工厂模式;

public class AFactroy implements A_FruitVegetable {
    @Override
    public Fruit createF() {
        return new Apple();
    }

    @Override
    public Vegetable createV() {
        return new Cabbage();
    }
}
