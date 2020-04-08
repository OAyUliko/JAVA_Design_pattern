package 行为型模式.解释器模式;

//终结符
public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    //实现了这个接口的运算
    @Override
    public boolean interpret(String context) {
            if(context.contains(data))
                return true;
            else
                return false;
    }
}
