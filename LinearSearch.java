import java.util.*;
class Search{
    Scanner sc = new Scanner(System.in);
    char ch[] = new char[10];
    int i,x;
    char target;
public void getVals(){
    System.out.println("Enter the array: ");
    ch = sc.nextLine().toCharArray();
    System.out.println("Enter the target element: ");
    target = sc.nextLine().charAt(0);

}

public int Find(){
    for(i=0;i<ch.length;i++){
        if(ch[i]==target){
            x=i;
        }
    }
    return x;
}

}
class LinearSearch{
    public static void main(String[] args) {
        Search fnd = new Search();
        fnd.getVals();
        int result = fnd.Find();
        result+=1;
        System.out.println("Position at: "+ result);
    }
}