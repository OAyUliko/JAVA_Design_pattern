package 行为型模式.命令模式;

public class ConcreteCommand implements Command{
    private Receiver receiver;
    private Order order;
    //放两个参数：命令执行者，执行的目标
    public ConcreteCommand(Receiver receiver,Order order) {
        this.receiver = receiver;//后厨
        this.order = order;//处理的订单
    }

    @Override
    public void execute() {
        System.out.println(order.getId()+"号顾客的果汁");
        receiver.MakeJuice(order);//榨果汁
    }
}
