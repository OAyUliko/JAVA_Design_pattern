package 行为型模式.迭代器模式;

public class Client {
    public static void main(String[] args){
        TVIterator tvIterator=new SkyWorthIterator();//创建具体品牌的迭代器
        tvIterator.setChannel(2);
        tvIterator.currentChannel();//当前是什么台
    }
}
