package 结构型模式.享元模式;

import java.util.HashMap;

public class PieceFactroy {
    private HashMap hashMap = new HashMap();

    //是否有黑白子对象，有的话在map里按key返回，没有的话创建一个再返回
    public Piece GetPiece(String key) {
        if (hashMap.containsKey(key))
            return (Piece) hashMap.get(key);
        else {
            Piece piece = new OnePiece(key);
            hashMap.put(key, piece);
            return piece;
        }
    }

        //获得池的大小
        public int GetPieceCount(){
            return hashMap.size();
        }
}
