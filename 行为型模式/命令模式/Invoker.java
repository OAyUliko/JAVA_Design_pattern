package 行为型模式.命令模式;

import java.util.ArrayList;

public class Invoker {
    private ArrayList<Command> commands;//记录订单的本子
    public Invoker() {
        commands=new ArrayList<>();
    }
    public void SetCommand(Command command){;//下订单！！
        commands.add(command);
    }

    public void OderUP(){
        //执行订单，因为是抽象的Command接口，不用知道里面是什么内容，直接用接口对象去完成
        System.out.println("有订单");
        for(Command command:commands){
            command.execute();
        }
    }}
