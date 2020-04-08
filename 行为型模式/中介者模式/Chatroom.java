package 行为型模式.中介者模式;

import java.util.Hashtable;

public class Chatroom extends AbsChatroom {
    private Hashtable members=new Hashtable();

    public void register(Member member) {
        if(!members.contains(member))
        {
            members.put(member.getName(),member);
            member.setChatroom(this);//注册到中介者中去
        }
    }

    //对发送过来的消息，首先get到接受者，处理非法消息，最后让接受者再receive
    public void sendText(String form, String to, String message) {
        Member member=(Member)members.get(to);
        String newmessage=message;
        newmessage=message.replaceAll("打","*");
        member.receiveText(form,newmessage);
    }
}
