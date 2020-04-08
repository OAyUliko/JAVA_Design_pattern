package 结构型模式.代理模式_静态;

public class Client {
    public static void main(String[] args) {
        LocalPic localPic=new LocalPic();//本地对象
        localPic.show("Meiko照片");//看似是调用本地图片，其实本地对象在背后调用远程图片类，加载图片
    }
}
