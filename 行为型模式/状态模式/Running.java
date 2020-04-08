package 行为型模式.状态模式;

public class Running extends ThreadState {
    public Running() {
        state=StateSet.RUNNING;
        System.out.println("线程 Running");
    }
    public void suspend(ThreadContext tc)
    {
        System.out.println("调用了RUNNABLE里面的suspend方法");
        tc.setThreadState(new Block());
    }
    public void stop(ThreadContext tc)
    {
        System.out.println("调用了RUNNABLE里面的stop方法");
        tc.setThreadState(new Dead());
    }
}
