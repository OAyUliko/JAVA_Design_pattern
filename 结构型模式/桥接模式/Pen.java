package 结构型模式.桥接模式;

public abstract class Pen {
    public void setColor(Color color) {
        this.color = color;
    }

    protected Color color;

    public abstract void draw(String Name);
}
