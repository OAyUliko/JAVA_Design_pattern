package 结构型模式.享元模式;

public abstract class Piece {
    protected String kind;

    public Piece(String kind) {
        this.kind = kind;
    }
    //下子的位置
    public abstract void Play(int x,int y);
}
