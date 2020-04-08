package 结构型模式.桥接模式;

public class BigPen extends Pen {
    public void draw(String Name)
    {
        String penType="大号笔画";
        this.color.bepaint(penType,Name);
    }
}
