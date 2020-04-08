package 行为型模式.解释器模式;

public class Client {
    public static void main(String[] args)
    {
        Expression isMale=getMaleExpression();
        Expression isMarriedWoman=getMarriedWomanExpression();

        System.out.println("John是男生吗？"+isMale.interpret("John"));
        System.out.println("Red结婚了吗？"+isMarriedWoman.interpret("Red Elle"));
    }

    //表明John和Nike都是男生，or操作表明context中只要包含双目操作符（isMale）中的一个便是男生
    private static Expression getMaleExpression() {
        Expression John=new TerminalExpression("John");
        Expression Nike=new TerminalExpression("Nike");
        return new OrExpression(John,Nike);
    }
    //表明Red和Elle都已婚，AND操作表明context中要包含双目操作符（isMale）中的两个才能是已婚
    private static Expression getMarriedWomanExpression() {
        Expression Red=new TerminalExpression("Red");
        Expression Elle=new TerminalExpression("Elle");
        return new AndExpression(Red,Elle);
    }
}
