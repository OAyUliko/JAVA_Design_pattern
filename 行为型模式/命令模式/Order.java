package 行为型模式.命令模式;

import java.util.HashMap;

public class Order {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private HashMap<String,Integer> menue;//订单
    public HashMap<String, Integer> getMenue() {
        return menue;
    }
    public void setMenue(String fruit,int num) {
        this.menue.put(fruit,num);//生成订单
    }

    public Order() {
        menue=new HashMap<String,Integer>();
    }
}
