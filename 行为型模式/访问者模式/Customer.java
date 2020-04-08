package 行为型模式.访问者模式;

public class Customer extends Vistor {
    @Override
    void visit(Apple apple) {
        System.out.println("顾客"+name+"选苹果");
    }

    @Override
    void visit(Book book) {
        System.out.println("顾客"+name+"选书");
    }
}
