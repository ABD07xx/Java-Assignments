import java.util.Scanner;
class NegativeAgeException extends Exception{
    public String toString(){
        return "Age can't be negative";
    }
}
class NegativeAge{
    public static int function(int x) throws NegativeAgeException{
        if(x<0){
            throw new NegativeAgeException();
        }
        else{
            return x;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            int x = function(age);
            System.out.println("Age is "+x);
        } catch(NegativeAgeException e){
            System.out.println(e);
        }
        }
}