package 行为型模式.状态模式;

public class Dead extends ThreadState {
    public Dead() {
        state=StateSet.DEAD;
        System.out.println("线程 Dead");
    }
}
