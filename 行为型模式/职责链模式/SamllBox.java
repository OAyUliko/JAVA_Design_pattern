package 行为型模式.职责链模式;

public class SamllBox  extends FruitHandle{
    public SamllBox(int weight) {
        super(weight);
    }

    @Override
    protected void pushBox(String name) {
        fruitBox.add("超市卖："+name);
    }
}
