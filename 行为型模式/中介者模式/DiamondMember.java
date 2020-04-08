package 行为型模式.中介者模式;

public class DiamondMember extends Member{
    public DiamondMember(String name) {
        super(name);
    }

    public void sendText(String form, String to, String message) {
        System.out.println("钻石会员专属！");
        chatroom.sendText(name,to,message);
    }
}
