class LowBalanceException extends Exception{
    public String toString(){
        return "Balance less than 200";
    }
}

public class UserDefinedException {
static void fun1(){
    try {
        throw new LowBalanceException();
    } catch (LowBalanceException e) {
        System.out.println(e);
    }
}

    public static void main(String[] args) {
        fun1();
    }
}
