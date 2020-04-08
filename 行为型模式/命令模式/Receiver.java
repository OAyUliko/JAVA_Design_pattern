package 行为型模式.命令模式;

public class Receiver {
    public void MakeJuice(Order order) {
        String str="";
        for(String fruit:order.getMenue().keySet())//keySet获取map的全部key值 即：对订单里的每个水果而言
        {
            str+=fruit+order.getMenue().get(fruit).toString();//水果名+相应的数量
        }
        System.out.println("成品："+str);
    }
}
