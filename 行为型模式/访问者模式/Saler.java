package 行为型模式.访问者模式;

public class Saler extends Vistor {
    @Override
    void visit(Apple apple) {
        System.out.println("收银员"+name+"给苹果算价格");
    }

    @Override
    void visit(Book book) {
        System.out.println("收银员"+name+"给书算价格");
    }
}
