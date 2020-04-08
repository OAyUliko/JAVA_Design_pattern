package 行为型模式.观察者模式;

public class Client {
    public static void main(String[] args){
        Subject subjectA=new AConcreteSubject();//新建A目标
        Observer objectA=new AConcreteObserver();//新建观察者A
        Observer objectB=new BConcreteObserver();//新建观察者B
        subjectA.Add(objectA);//把观察者A在A目标里注册
        subjectA.Add(objectB);//把观察者B在A目标里注册
        subjectA.NotifyObserver();
    }
}
