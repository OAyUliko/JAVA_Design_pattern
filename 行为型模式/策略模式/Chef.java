package 行为型模式.策略模式;

public class Chef {
    private CutFruit cutmethod;//切的策略
    public void SetStragety(CutFruit cutmethod) {
        this.cutmethod = cutmethod;
    }
    public void Cut(String fruitname){
        cutmethod.CutStrategy(fruitname);
    }
}
