package 结构型模式.外观模式;

public class Client {
    public static void main(String[] args){
        GeneralSwitchFacade gsf =new GeneralSwitchFacade();//相当于总面板
        gsf.on();
        System.out.println("----------------------");
        gsf.off();
    }
}
