package 结构型模式.桥接模式;

public class Client {
    public static void main(String[] args)
    {
        //这里和下一行最好是用配置文件XMLUtil，实现客户端的透明
        Color color= new Red();//找颜料
        Pen pen=new BigPen();//找笔
        pen.setColor(color);//笔沾上颜料
        pen.draw("Meiko");//笔画什么
    }
}
