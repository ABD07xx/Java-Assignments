import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int x[]= new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter data in Array: ");
        for(int i=0;i<x.length;i++){
            x[i] = input.nextInt();
        }
        for(int i=0;i<x.length;i++){
            System.out.println("Data entered is: "+" "+x[i]);
        }
// User giving size
        System.out.println("Enter Size of Array: ");
        int size = input.nextInt();
        int arr[]= new int[size];

        System.out.println("Enter data in Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Data entered is: "+" "+arr[i]);
        }
//Reversing an Array
        System.out.println("Reversed Array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println("Reversed Array is: "+" "+arr[i]);
        }
    }
}
