import java.util.*;
class Library{
public static void main(String[] args) {
    System.out.println("Enter the number of days the member is late: ");
    Scanner input = new Scanner(System.in);
    int days = input.nextInt();
    if(days > 0 && days <= 5){
        System.out.println("You've been fined Rs. 0.50 "  );
    }
    else if (days > 5 && days <= 10 ){
        System.out.println("You've been fined Rs. 1.00 "  );
    }
    else if (days > 10 && days < 30){
       
        System.out.println("You've been fined Rs. 10.0 "  );
    }
    else{
        System.out.println("You've been fined Rs 10 and your membership is cancelled");
    }
    
}

}