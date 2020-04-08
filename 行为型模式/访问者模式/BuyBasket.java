package 行为型模式.访问者模式;

import com.mysql.fabric.xmlrpc.base.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class BuyBasket {
    private ArrayList arrayList =new ArrayList();
    public void Add(Product product)
    {
        arrayList.add(product);
    }
    public void Remove(Product product)
    {
        arrayList.remove(product);
    }
    public void accept(Vistor vistor)
    {
        Iterator i=arrayList.iterator();
        while(i.hasNext())
        {
            ((Product)i.next()).accept(vistor);//一样样来访问
        }
    }
}
