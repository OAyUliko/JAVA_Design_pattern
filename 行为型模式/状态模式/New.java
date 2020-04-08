package 行为型模式.状态模式;
//新建状态
public class New extends ThreadState {
    public New() {
        state=StateSet.NEW;
        System.out.println("线程 NEW");
    }
    public void start(ThreadContext tc)
    {
        System.out.println("调用了NEW里面的start方法");
        tc.setThreadState(new Runnable());
    }
}
