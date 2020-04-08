package 创建型模式.抽象工厂模式;

public class Client {
    public static void main(String[] args){
        A_FruitVegetable a_fruitVegetable=new AFactroy();
        Fruit fruit=a_fruitVegetable.createF();
        Vegetable vegetable=a_fruitVegetable.createV();
        fruit.eat();
        vegetable.eat();
    }



}
