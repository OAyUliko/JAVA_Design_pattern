package 行为型模式.职责链模式;

public class BigBox extends FruitHandle{
    public BigBox(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String name) {
        fruitBox.add("打成果汁卖："+name);//满足重量的，加入盒子
    }
}
