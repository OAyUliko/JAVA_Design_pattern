package 结构型模式.适配器模式;

public class Adapter extends OldJuicer implements NewJuicer {
    @Override
    public String newPort(Fruit fruit1, Fruit fruit2) {//老果汁机，新果汁机
        String str1=onePort(fruit1);
        str1+=onePort(fruit2);
        return str1;
    }
}
