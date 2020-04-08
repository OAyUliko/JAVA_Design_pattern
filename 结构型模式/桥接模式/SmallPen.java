package 结构型模式.桥接模式;

public class SmallPen extends Pen {
    public void draw(String Name)
    {
        String penType="小号笔画";
        this.color.bepaint(penType,Name);//这里是看不出是什么颜色的，从客户端来颜色
    }
}
