package multithreading;

public class Thread1 extends Thread{

    private String tname;

    Thread1(String name){
        tname = name;
        System.out.println("Creating Thread " +  tname);
    }

    @Override
    public void run() {

    try{
        for(int i = 9; i>0 ; i--){
            System.out.println(i + ". Thread name = " + tname);
            Thread.sleep(10);
        }
    }
    catch (InterruptedException e){
        e.printStackTrace();
    }
    }
}

class ThreadDemo {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1("T1");
        Thread1 t2 = new Thread1("T2");

        t1.start();
        t2.start();
    }
}
