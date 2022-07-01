import java.util.*;
class Insurance{
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            boolean isHealthy, lives_in_city , isMale;
            int age;
            double premium , MaxPolicy;
            System.out.println("Please write True or False");
            System.out.println("Is the person healthy?");
            isHealthy = input.nextBoolean();

            System.out.println("Does the person lives in a city?");
            lives_in_city = input.nextBoolean();

            System.out.println("Is the peron Male?");
            isMale = input.nextBoolean();
            
            System.out.println("Enter Your age: ");
            age = input.nextInt();

            if((isHealthy == true) && (lives_in_city == true) && (isMale == true) && (age>=25 && age<= 35)){
                premium = (4.0/1000.0);
                MaxPolicy = 200000;
                System.out.println("The person should be insured, premium rates will be " + premium + " and he can get a maximum insurance coverage upto Rs. " + MaxPolicy);
            }
            else if((isHealthy == false) && (lives_in_city == false) && (isMale == true) && (age>=25 && age<= 35)){
                premium = (6.0/1000.0);
                MaxPolicy = 10000;
                System.out.println("The person should be insured, premium rates will be " + premium + " and he can get a maximum insurance coverage upto Rs. " + MaxPolicy);
            }
            else if((isHealthy == true) && (lives_in_city == true) && (isMale == false) && (age>=25 && age<= 35)){
                premium = (3.0/1000.0);
                MaxPolicy = 100000;
                System.out.println("The person should be insured, premium rates will be " + premium + " and he can get a maximum insurance coverage upto Rs. " + MaxPolicy);
            }
            else {
                System.out.println("The person shouldn't be insured");
             }
        }
             
    }
}
