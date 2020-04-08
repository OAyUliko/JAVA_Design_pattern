package 行为型模式.职责链模式;

import java.util.ArrayList;
import java.util.List;

public abstract class FruitHandle {
    private int weight;
    protected List<String> fruitBox;
    private FruitHandle nextfruitHandle;//如果当前分拣器处理不了 就移到下一个

    public FruitHandle(int weight) {
        this.weight = weight;
        fruitBox=new ArrayList<String>();
    }
    public void SendFruit(int weight,String name)
    {
        if(this.weight==weight)//进来的水果重量=规定的重量 加入盒子
            pushBox(name);//分拣器怎么做 是交给子类来做的
        else
            if(nextfruitHandle!=null)//进来的水果重量！=规定的重量 加入下一个分拣器
                nextfruitHandle.SendFruit(weight,name);
    }
    abstract protected void pushBox(String name);

    public void GetFruitBox(){
        System.out.println("当前分拣器的重量："+weight+" 水果数："+fruitBox.size());
        for(String fruit:fruitBox)//对水果盒子里的每个水果而言
        {
            System.out.println(fruit);
        }
    }

    public void Next(FruitHandle nextfruitHandle){
        this.nextfruitHandle=nextfruitHandle;
    }
}
