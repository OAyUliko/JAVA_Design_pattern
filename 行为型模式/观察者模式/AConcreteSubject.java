package 行为型模式.观察者模式;

public class AConcreteSubject extends Subject{
    public AConcreteSubject() {
        super();
    }

    @Override
    void NotifyObserver() {
        System.out.println("目标A发生改变了");
        for(Observer observer:observers)
        {
            observer.response();//通知A的每一个观察者
        }
    }
}
