public class CheckUncheckedExceptions {
    static void fun1(){
    try {
        System.out.println(10 / 0);
        //unchecked exception program will compile run time error
    }
    catch(Exception e){
        System.out.println(e.getMessage());
        //System.out.println("Error divide by 0");
    }
        System.out.println("Ok Bye ");
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
