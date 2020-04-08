package 行为型模式.状态模式;

public class ThreadContext {
    public ThreadState getThreadState() {
        return threadState;
    }

    public void setThreadState(ThreadState threadState) {
        this.threadState = threadState;
    }

    private ThreadState threadState;

    public ThreadContext() {
        threadState =new New();//状态一开始的状态要写明！！
    }

    public void start(){
        ((New)threadState).start(this);
    }
    public void getcpu(){
        ((Runnable)threadState).getcpu(this);
    }
    public void suspend(){
        ((Running)threadState).suspend(this);
    }
    public void stop(){
        ((Running)threadState).stop(this);
    }



}
