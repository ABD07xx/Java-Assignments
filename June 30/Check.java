import java.util.*;
class Check{
    public static void main(String[] args) {
        System.out.println("Enter a character");
        try (Scanner input = new Scanner(System.in)) {
            char ch = input.next().charAt(0);
            int ascii = (int) ch;
            System.out.println("Ascii for character  " +  ch  + " is " +  ascii);
            if(ascii>= 0 && ascii <= 47 || ascii >= 58 && ascii <= 64 || ascii >= 91 && ascii <= 96 || ascii >= 123 && ascii <= 127){
                System.out.println("You Entered a special symbol ");
            }
            else if(ascii >= 65 && ascii <= 90){
                System.out.println("Capital Case Character");
            }
            else if(ascii >= 97 && ascii <= 122){
                System.out.println("Small Case Character");
            }
            else if(ascii >= 48 && ascii <= 57){
                System.out.println("Number Entered");
            }
        }
    }
}