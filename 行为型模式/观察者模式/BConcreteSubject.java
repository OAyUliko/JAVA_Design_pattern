package 行为型模式.观察者模式;

public class BConcreteSubject extends Subject{
    public BConcreteSubject() {
        super();
    }

    @Override
    void NotifyObserver() {
        System.out.println("目标B发生改变了");
        for(Observer observer:observers)
        {
            observer.response();
        }
    }
}
