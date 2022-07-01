import java.util.*;
class Grades{
    public static void main(String[] args) {
        int mark_in_A, mark_in_B;
	System.out.println("enter the marks obtained  in subject A and B ");
    Scanner input = new Scanner(System.in);
    mark_in_A = input.nextInt();
    mark_in_B = input.nextInt();
	
	if (mark_in_A >= 55 && mark_in_B >= 45)
	{
		System.out.println("STUDENT QUALIFIES FOR DEGREE ");
	}
	else if (mark_in_A >= 45 && mark_in_B >= 55)
	{
		System.out.println("STUDENT QUALIFIES FOR DEGREE ");
	}
	else if (mark_in_A >= 65 && mark_in_B < 45)
	{
		System.out.println("reappear in an examination in Subject B to qualify");
	}
	else
		System.out.println("Student has failed");
    }
}