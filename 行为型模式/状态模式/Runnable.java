package 行为型模式.状态模式;
//就绪状态
public class Runnable extends ThreadState {
    public Runnable() {
        state=StateSet.RUNNABLE;
        System.out.println("线程 RUNNABLE");
    }
    public void getcpu(ThreadContext tc)
    {
        System.out.println("调用了RUNNABLE里面的getcpu方法");
        tc.setThreadState(new Running());
    }
}
