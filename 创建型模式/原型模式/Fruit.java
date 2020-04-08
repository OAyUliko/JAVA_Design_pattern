package 创建型模式.原型模式;

public class Fruit implements Cloneable{
    protected String kind;
    public Object clone() throws CloneNotSupportedException {
        Object object=super.clone();
        return object;
    }

    public void Display() {
        System.out.println(kind);
    }
}
