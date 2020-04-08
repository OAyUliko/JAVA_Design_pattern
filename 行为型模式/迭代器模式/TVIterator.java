package 行为型模式.迭代器模式;

public interface TVIterator {
    void next();
    void previous();
    boolean isLast();
    boolean isFirst();
    void setChannel(int tvNO);
    void currentChannel();
}
