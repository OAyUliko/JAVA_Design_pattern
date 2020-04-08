package 行为型模式.观察者模式;

public class BConcreteObserver implements Observer {
    @Override
    public void response() {
        System.out.println("观察者接受到了改变，做出B反应");
    }
}
