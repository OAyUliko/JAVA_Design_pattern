package 行为型模式.访问者模式;

public class Client {
    public static void main(String[] args){
        Product p1=new Apple();
        Product p2=new Book();
        Vistor vistor=new Customer();
        vistor.setName("小明");
        BuyBasket buyBasket=new BuyBasket();
        buyBasket.Add(p1);
        buyBasket.Add(p2);
        buyBasket.accept(vistor);

    }
}
