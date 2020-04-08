package 结构型模式.组合模式;

public class Client {
    public static void main(String[] args) {
        MyElement e1, e2, e3;
        Plate p1, p2;
        e1 = new Apple();
        e2 = new Orange();
        p1 = new Plate();
        p1.Add(e1);
        p1.Add(e2);

        p2 = new Plate();
        p1.Add(p2);

        e3 = new Apple();
        p2.Add(e3);

        p1.eat();
    }
}
