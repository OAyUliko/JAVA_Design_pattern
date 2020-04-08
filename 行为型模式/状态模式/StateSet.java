package 行为型模式.状态模式;

//把状态用静态全局变量表示，便于编写
public final class StateSet {
    public static int NEW=1;
    public static int RUNNABLE=2;
    public static int RUNNING=3;
    public static int BLOCK=4;
    public static int DEAD=5;


}
