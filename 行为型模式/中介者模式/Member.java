package 行为型模式.中介者模式;

public abstract class Member {
    protected  AbsChatroom chatroom;
    protected String name;

    public AbsChatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(AbsChatroom chatroom) {
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }

    public Member(String name) {
        this.name = name;
    }

    public abstract void sendText(String form,String to,String message);

    public void receiveText(String form,String message){
        System.out.println(form+"发送消息给你："+message);
    }
}
