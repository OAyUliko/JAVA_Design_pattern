package 创建型模式.原型模式;

import java.util.Hashtable;

public class FruitStore {
    private static Hashtable fruittable=new Hashtable<Integer,Fruit>();//水果架
    public void Add(Integer i,Fruit fruit)//放入水果
    {
        fruittable.put(i,fruit);
    }
    public Fruit Get(Integer i) throws CloneNotSupportedException//取出水果，但要取出复制品，不是仅有的那一个水果
    {
        Fruit fruit=(Fruit) fruittable.get(i);
        return (Fruit)fruit.clone();//把水果拿出来克隆了再返回 其实是个浅拷贝
    }
}
