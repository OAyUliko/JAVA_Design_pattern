package 行为型模式.策略模式;

public class Knife implements  CutFruit{
    @Override
    public void CutStrategy(String fruitname) {
        System.out.println(fruitname+"一次被切成两半");
    }
}
