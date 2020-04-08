package 行为型模式.中介者模式;

public class GodenMember extends Member{
    public GodenMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String form, String to, String message) {
        System.out.println("！！！！黄金会员专属！！！！");
        chatroom.sendText(name,to,message);
    }
}
