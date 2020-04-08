package 创建型模式.简单工厂模式;

    public class Client {
    public static void main(String[] args)
    {
        Factroy factroy=new Factroy();
        Fruit fruit=factroy.CreatFruit("A");
        fruit.eat();
    }
}
