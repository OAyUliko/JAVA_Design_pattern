package 结构型模式.组合模式;

import 创建型模式.建造者模式.Meal;

import java.util.ArrayList;

public class Plate extends MyElement {
    private ArrayList<MyElement> arrayList=new ArrayList();
    //Add和Delete方法是不知道放了什么进去，只知道放了
    public void Add(MyElement e)
    {
        arrayList.add(e);
    }
    public void Delete(MyElement e)
    {
        arrayList.remove(e);
    }
    //递归调用 针对arrrylist里的每个元素 叶子结点就“吃”，盘子就递归调用eat
    @Override
    void eat() {
        for(Object object:arrayList)
            ((MyElement)object).eat();
    }
}
