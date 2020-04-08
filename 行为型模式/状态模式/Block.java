package 行为型模式.状态模式;

public class Block extends ThreadState {
    public Block() {
        state=StateSet.BLOCK;
        System.out.println("线程 Block");
    }
    public void resume(ThreadContext tc)
    {
        System.out.println("调用了RUNNABLE里面的resume方法");
        tc.setThreadState(new Runnable());
    }
}
