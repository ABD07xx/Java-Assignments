class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
            System.out.println(getState());
        }

    }

}


public class MethodsThread {
    public static void main(String[] args) throws Exception{
        MyThread t=new MyThread("MyThread1");
        t.setDaemon(true); // will work if everything after t.start is removed
        t.start();
        System.out.println(t.getState());
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println("Priority"+t.getPriority());

      /*  Thread Thread1 = Thread.currentThread();
        Thread1.join();*///infinite loop for wait
        System.out.println(t.getState());

    }
}
