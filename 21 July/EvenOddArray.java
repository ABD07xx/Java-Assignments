import java.util.Scanner;
class EvenOdd {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];
    int count_even,count_odd;
   public void getVals(){
    for(int i=0;i<6;i++){
       arr[i] = sc.nextInt();
    }
}
    public int isEven(){
        for(int i =0;i<6;i++){
            if(arr[i]%2==0){
                count_even++;
            }
        }
        return count_even;
    } 
    public int isOdd(){
        for(int i =0;i<6;i++){
            if(arr[i]%2!=0){
                count_odd++;
            }
        }
        return count_odd;
    } 
}
class  EvenOddArray{
    public static void main(String[] args) {
        EvenOdd inp = new EvenOdd();
        inp.getVals();
        int x = inp.isEven();
        int y = inp.isOdd();
        System.out.println(x+"<----Even,Odd-------->"+y);
    }
}
