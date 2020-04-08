package 结构型模式.适配器模式;

public class OldJuicer {
    public String onePort(Fruit fruit) {
        String str=fruit.getKind()+"果汁";
        return str;
    }
}
