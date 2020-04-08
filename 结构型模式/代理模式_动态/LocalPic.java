package 结构型模式.代理模式_动态;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LocalPic {
    private Object target;//目标类，到底代理谁

    public LocalPic(Object target) {
        super();
        this.target = target;
    }
    public Object GetProxyInstance()
    {
        //被代理类的名字列表，被代理的方法，方法的参数数组
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            //调用了被代理类里面的方法,Method method是接口方法， Object[] args是参数
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("准备载入图片"+args[0]);//args是名字,只有一个参数
                Thread thread=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            method.invoke(target,args);//远程图片调用，Method method就是远程的方法
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
                return null;
            }
        });
    }

}
