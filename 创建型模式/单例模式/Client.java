package 创建型模式.单例模式;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fruit f1=new Apple();
        FruitStore fs1=FruitStore.GetFruitStore();//第一个水果店
        FruitStore fs2=FruitStore.GetFruitStore();//第二个水果店，但其实还是第一个,指向同一个对象
        fs1.Add(1,f1);
        fs1.Add(2,new Apple());

        Fruit fru=fs1.Get(2);
        f1.Display();
        System.out.println(f1.hashCode());
        fru.Display();
        System.out.println(fru.hashCode());
        System.out.println(fs1.hashCode());
        System.out.println(fs2.hashCode());

    }
}
