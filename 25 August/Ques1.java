class Count{
static int count = 0;
Count(){
count++;
}

}
class Ques1{
public static void main(String args[]){
Count obj1 = new Count();
Count obj2 = new Count();
Count obj3 = new Count();

System.out.println(Count.count);
}
}