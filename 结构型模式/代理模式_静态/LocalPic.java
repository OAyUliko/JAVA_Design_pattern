package 结构型模式.代理模式_静态;

public class LocalPic implements IShowPic,Runnable{
    private IShowPic iShowPic;
    private String picName;

    @Override
    public void show(String picName){
        iShowPic=new RemotePic();//真正完成远程代理
        this.picName=picName;
        System.out.println("准备载入图片"+picName);
        Thread thread=new Thread(this);//把自己放入线程
        thread.start();//启动线程
    }

    @Override
    public void run() {//调取远程的图片
        try {
            iShowPic.show(picName);
            System.out.println("图片加载完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
