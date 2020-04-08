package 行为型模式.中介者模式;

public class Client {

    public static void main(String[] args) {
        Member member1,member2;
        Chatroom cr=new Chatroom();
        member1=new DiamondMember("小明");
        member2=new GodenMember("小王");

        cr.register(member1);
        cr.register(member2);

        member1.sendText(member1.name,member2.name,"你好呀呀呀呀呀");
        member2.sendText(member2.name,member1.name,"你好嘻嘻");
        member1.sendText(member1.name,member2.name,"打你！");
        member2.sendText(member2.name,member1.name,"你说森么");
    }
}
