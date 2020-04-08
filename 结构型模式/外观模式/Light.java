package 结构型模式.外观模式;

public class Light {
    private String position;

    public Light(String position) {
        this.position = position;
    }

    public void on(){
        System.out.println(this.position+"亮了");
    }
    public void off(){
        System.out.println(this.position+"熄了");
    }
}
