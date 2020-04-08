package 行为型模式.迭代器模式;

public class SkyWorthIterator implements TVIterator {
    private int currentTVNO=0;//当前的台号：0
    SkyWorthTV skyWorthTV=new SkyWorthTV();
    @Override
    public void next() {
        if (currentTVNO<skyWorthTV.obj.length)
        currentTVNO++;
    }

    @Override
    public void previous() {
        if (currentTVNO>0)
            currentTVNO--;
    }

    @Override
    public boolean isLast() {
        return currentTVNO==skyWorthTV.obj.length;
    }

    @Override
    public boolean isFirst() {
        return currentTVNO==0;
    }

    @Override
    public void setChannel(int tvNO) {
        currentTVNO=tvNO;
    }

    @Override
    public void currentChannel() {
       System.out.println(skyWorthTV.obj[currentTVNO]);
    }
}
