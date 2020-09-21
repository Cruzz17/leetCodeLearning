package Thread;

public class HuoChePiao extends Thread {
    private static int tcketNum=10;
    public HuoChePiao(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<100;i++){
            if(tcketNum>0){
            System.out.println("我在"+this.getName()+"个窗口买到火车票"+"剩余的第"+tcketNum--+"huochepia");}
        }

    }
}
