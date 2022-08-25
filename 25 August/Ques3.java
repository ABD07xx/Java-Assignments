import java.util.*;

class Person{
Scanner sc       = new Scanner(System.in);

String name,address; 
double contact;
int emp_id;
void get(){

System.out.println("Name:");
name     = sc.nextLine();
System.out.println("Address:");
address  = sc.nextLine();
System.out.println("Conatct:");
contact = sc.nextDouble();
}
}

class Employee extends Person{
double base_salary;
double bonus=0;

void get2(){
System.out.println("Emp_id:");
int emp_id  = sc.nextInt();
}
void getSal(double s){
base_salary = s;
}
double calcGross(){
return bonus + base_salary;
}
void display(){
System.out.println(name+" " + address +" " + contact + "  " + emp_id +" "+base_salary);
}

}

class Instructor extends Employee{
double bonus;
void getBonus(double x){
bonus = x;
}
double calcGross(){
return bonus + base_salary;
}
void display(){
System.out.println(name+" " + address +" " + contact + "  " + emp_id +" "+base_salary +" " +calcGross());
}

}

class Ques3{
public static void main(String args[]){
Instructor obj1 = new Instructor();
obj1.get();
obj1.get2();
obj1.getSal(10000);
obj1.getBonus(1000);
obj1.calcGross();
obj1.display();

}


}