import java.util.Scanner;

public class UserNameEmail {
    static String userName(String email){
        int a = email.indexOf('@');

        String name = email.substring(0,a);
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Enter an email address: ");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine( );
        String ch = userName(email);
        System.out.println("UserName: "+""+ch);
    }
}
