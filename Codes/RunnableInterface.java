import java.util.concurrent.TimeUnit;

class RunnableInterface0 implements Runnable {
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

class RunnableInterface2 implements Runnable {
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
    class RunnableInterface3 implements Runnable {
    public void run() {
        int i = 1;
        while (i <= 10) {
            while (i <= 10) {
                System.out.println(i + " " + "CPU Executing 4th Thread");
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

public class RunnableInterface{
            public static void main(String[] args) {
                RunnableInterface0 t = new RunnableInterface0();
                RunnableInterface2 t2 = new RunnableInterface2();
                RunnableInterface3 t3 = new RunnableInterface3();
                Thread th = new Thread(t);
                Thread th2 = new Thread(t2);
                Thread th3 = new Thread(t3);
                th.start();
                th2.start();
                th3.start();
                int i = 1;
                while (i <= 10) {
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
        }


