package 创建型模式.简单工厂模式;

public class Factroy {
    public Fruit CreatFruit(String kind) {
        if(kind.equals("A"))
            return new Apple();
        else if(kind.equals("B"))
            return new Banana();
        return  null;
    }
}
