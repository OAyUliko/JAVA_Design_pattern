package 行为型模式.策略模式;

public class Client {
    public static void main(String[] args) {
        Chef chef=new Chef();//找个厨师
        CutFruit cutMethod=new Knife();//选一把刀
        chef.SetStragety(cutMethod);
        chef.Cut("苹果");
    }
}
