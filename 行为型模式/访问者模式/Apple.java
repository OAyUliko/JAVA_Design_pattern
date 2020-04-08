package 行为型模式.访问者模式;

public class Apple implements Product {
    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
