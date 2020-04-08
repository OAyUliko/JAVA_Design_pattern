package 行为型模式.迭代器模式;

public class SkyWorthTV implements TV{
    public Object[] obj={"cctv1","cctv2","cctv3","cctv4"};//用列表存储的电视台，

    @Override
    public TVIterator iterator() {
        return  null;//return  new SkyWorthIterator();//创建相应的迭代器
    }
}
