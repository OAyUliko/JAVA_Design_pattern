package 结构型模式.代理模式_动态;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        IShowPic iShowPic=new RemotePic();//得到远程的对象
        LocalPic localPic= new LocalPic(iShowPic);//得到本地的对象，把远程对象放进来
        IShowPic LP= (IShowPic) localPic.GetProxyInstance();//把远程对象实例化，通过实例化了的远程对象来加载图片
        LP.show("Meiko");
    }
}
