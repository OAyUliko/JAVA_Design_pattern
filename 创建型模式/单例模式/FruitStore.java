package 创建型模式.单例模式;

import java.util.Hashtable;

public class FruitStore {
    private static Hashtable fruittable;//水果架
    private static FruitStore fruitStore;//水果店
    private FruitStore() {//把构造函数设为private ， 这样外界就不能直接new了，只能通过GetFruitStore来获得对象
        fruittable=new Hashtable<Integer,String>();
    }
    public static FruitStore GetFruitStore()
    {
        if(fruitStore==null)//如果水果店不存在，就创建一个水果店，如果存在一个实例了，就返回那个实例
        {fruitStore=new FruitStore();}
         return fruitStore;
    }

    public void Add(Integer i, Fruit fruit)//放入水果
    {
        fruittable.put(i,fruit);
    }
    public Fruit Get(Integer i) throws CloneNotSupportedException//取出水果，但要取出复制品，不是仅有的那一个水果
    {
        Fruit fruit=(Fruit) fruittable.get(i);
        return (Fruit)fruit.clone();//把水果拿出来克隆了再返回 其实是个浅拷贝
    }
}
