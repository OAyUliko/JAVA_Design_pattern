package 行为型模式.访问者模式;

public abstract class Vistor {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name;

    abstract void visit(Apple apple);
    abstract void visit(Book book);

}
