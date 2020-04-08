package 结构型模式.代理模式_静态;

public class RemotePic implements IShowPic {
    @Override
    public void show(String picName) throws InterruptedException {
        for(int i=0;i<3;i++)
        {
            System.out.println("第"+(i+1)+"轮加载");
            Thread.sleep(1000);
        }
    }
}
