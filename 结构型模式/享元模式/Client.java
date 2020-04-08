package 结构型模式.享元模式;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random rm = new Random();
        PieceFactroy pieceFactroy = new PieceFactroy();//生产棋子的工厂
        Piece piece;//棋子对象
        for(int i=0;i<19;i++)//按棋盘大小随机落子
            for(int j=0;i<19;i++)
            {
                if(rm.nextInt()%2==0)
                    piece=pieceFactroy.GetPiece("黑");
                else
                    piece=pieceFactroy.GetPiece("白");
                piece.Play(rm.nextInt(19),rm.nextInt(19));//随机放置
            }
        System.out.println(pieceFactroy.GetPieceCount());//其实系统中只有两个对象，黑子和白子，都是共享这两个对象
    }
}
