import java.util.concurrent.TimeUnit;

class ThreadTest0 extends Thread {
    public void run() {
        int i = 1;
        while (i <= 10) {
            while (i <= 10) {
                System.out.println(i + " " + "CPU Executing 2nd Thread");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;
            }
        }
    }
}
    class ThreadTest2 extends ThreadTest0 {
        public void run() {
            int i = 1;
            while (i <= 10) {
                while (i <= 10) {
                    System.out.println(i + " " + "CPU Executing 3rd Thread");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    i++;
                }
            }
        }
    }
class ThreadTest{
        public static void main(String[] args) {
            ThreadTest0 t = new ThreadTest0();
            ThreadTest2 t2 = new ThreadTest2();
            t.start();
            t2.start();
            int i = 1;
            while (i <= 10) {
                System.out.println(i + " " + "CPU Executing 1st Thread");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;
            }
        }
    }