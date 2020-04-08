package 行为型模式.策略模式;

public class MultiKnife  implements  CutFruit{
    @Override
    public void CutStrategy(String fruitname) {
        System.out.println(fruitname+"一次被切成五块");
    }
}
