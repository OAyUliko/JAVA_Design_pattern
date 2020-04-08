package 创建型模式.原型模式;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fruit f1=new Apple();
        FruitStore fs=new FruitStore();
        fs.Add(1,f1);
        fs.Add(2,new Apple());

        Fruit fru=fs.Get(2);
        f1.Display();
        System.out.println(f1.hashCode());
        fru.Display();
        System.out.println(fru.hashCode());

    }
}
