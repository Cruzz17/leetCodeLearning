package Shangxuetang;

import java.lang.annotation.Target;

//适配器模式
public class Adaptee {
    public void surf(){
        System.out.println(" 上网  ");
    }
}
//客户的目的
interface Tosurf{
    void Tosurf();
        }
class Client{
    public void want(Tosurf t){
        t.Tosurf();
    }
}
class Adapter extends Adaptee implements Tosurf{

    @Override
    public void Tosurf() {
        System.out.println("转换");
        super.surf();
    }
}
//对象适配器
class Adapter1 implements Tosurf{
    Adaptee adaptee;
    public Adapter1(Adaptee adaptee){
        this.adaptee=adaptee;

    }

    @Override
    public void Tosurf() {
        adaptee.surf();
    }
}
class Test1{
    public static void main(String[] args) {
        new Client().want(new Adapter());
    }

}