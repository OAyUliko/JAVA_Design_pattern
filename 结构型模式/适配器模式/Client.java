package 结构型模式.适配器模式;

public class Client {
    public static void main(String[] args)
    {
        NewJuicer newJuicer=new Adapter();
        Fruit fruit1=new Fruit();
        Fruit fruit2=new Fruit();
        fruit1.setKind("Apple");
        fruit2.setKind("Orange");
        System.out.println("混合果汁："+newJuicer.newPort(fruit1,fruit2));
    }
}
