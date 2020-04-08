package 结构型模式.桥接模式;

public class Blue implements Color {
    @Override
    public void bepaint(String PenType, String Name) {
        System.out.println(PenType+"蓝色的"+Name);
    }
}
