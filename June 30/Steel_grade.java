import java.util.*;
class Steel_grade {
    public static void main(String[] args) {
        int grade = 0;
        try (Scanner input = new Scanner(System.in)) {
    System.out.println("Enter the Hardness of Steel range(1,100)");
    int Hardness = input.nextInt();
    System.out.println("Enter the Carbon content present range(0.0-1.0)");
    float Carbon = input.nextFloat();
    System.out.println("Enter the Tensile Strength ");
    int Tensile = input.nextInt();


int hardness_factor=0,carbon_factor=0,tensile_factor=0;	
   //For first three conditional
 if (Hardness>50)
   hardness_factor=1;
if (Carbon<0.7)
   carbon_factor=1;
if (Tensile>5600)
   tensile_factor=1;

//For Finding Grade
//1. if none of the conditions are met
if((hardness_factor==0) && (carbon_factor==0) && (tensile_factor==0))
   grade = 5;

//2. if only one condition is met
if((hardness_factor==1) || (carbon_factor==1) || (tensile_factor==1))
   grade = 6;

//3 if condition (i) and (iii) are met
if((hardness_factor==1) && (carbon_factor==0) && (tensile_factor==1))
   grade = 7;

//4. if conditions (ii) and (iii) are met
if((hardness_factor==0) && (carbon_factor==1) && (tensile_factor==1))
   grade = 8;

//5. if conditions (i) and (ii) are met
if((hardness_factor==1) && (carbon_factor==1) && (tensile_factor==0))
   grade = 9;

//6. if all the three conditions are met
if((hardness_factor==1) && (carbon_factor==1) && (tensile_factor==1))
   grade = 10;


    System.out.println("Steel is of grade: "+ grade);

        }      
    }
}