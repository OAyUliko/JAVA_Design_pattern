package 行为型模式.命令模式;

public class Client {
    public static void main(String[] args) {
        //创建订单
        Order order1=new Order();
        order1.setId(1);//订单号是1
        order1.setMenue("苹果",2);//订单里面有什么水果？
        order1.setMenue("西瓜",1);
        //创建操作者
        Receiver receiver=new Receiver();//大厨
        //将多个订单封装成命令对象
        ConcreteCommand concreteCommand=new ConcreteCommand(receiver,order1);
        //创建调用者并加命令
        Invoker invoker=new Invoker();
        invoker.SetCommand(concreteCommand);//下单
        //执行命令
        invoker.OderUP();
    }
}
