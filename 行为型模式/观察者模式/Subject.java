package 行为型模式.观察者模式;

import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer>observers;

    public Subject() {
        observers=new ArrayList<Observer>();
    }
    public void Add(Observer observer){
        observers.add(observer);
    }
    public void Remove(Observer observer){
        observers.remove(observer);
    }
    abstract void NotifyObserver();
}
