package 行为型模式.解释器模式;
//双目运算符
public class OrExpression implements Expression{
    private Expression expr1=null;
    private Expression expr2=null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    //或运算
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context)||expr2.interpret(context);
    }
}
