package 行为型模式.状态模式;

public class Client {
    public static void main(String[] args) {
        ThreadContext tc=new ThreadContext();
        tc.start();
        tc.getcpu();
        tc.suspend();
    }
}
