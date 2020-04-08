package 行为型模式.职责链模式;

import java.util.Random;

public class Client {
    public static void main(String[] args){
        FruitHandle bighandle,smallhandle;
        bighandle=new BigBox(9);//规定大果是9g
        smallhandle=new SamllBox(4);//规定小果是4g
        bighandle.Next(smallhandle);//大果的下个分拣器是小果 链条构成

        Random random=new Random();
        for(int friutnum=0;friutnum<500;friutnum++)
        {
            int weight=random.nextInt(10);//获得0-10的随机重量
            bighandle.SendFruit(weight,"苹果");
        }
        bighandle.GetFruitBox();
        smallhandle.GetFruitBox();
    }
}
