package 行为型模式.中介者模式;

public abstract class AbsChatroom {
    public abstract void register(Member member);

    public abstract void sendText(String form,String to,String message);

}
