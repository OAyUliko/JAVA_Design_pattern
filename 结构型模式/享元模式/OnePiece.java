package 结构型模式.享元模式;

public class OnePiece extends Piece{
    public OnePiece(String kind) {
        super(kind);
    }
    @Override
    public void Play(int x, int y) {
        System.out.println(kind+"子落在（"+x+","+y+")的位置");
    }
}
