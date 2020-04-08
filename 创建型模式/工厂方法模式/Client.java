package 创建型模式.工厂方法模式;

public class Client {
    public static void main(String[] args)
    {
       Factroy factroyB=new BFactroy();
       Fruit fruit=factroyB.CreatFruit();
       fruit.eat();
    }
}
