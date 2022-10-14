
public class Overloading {
    static void add(int x, int y) {
        int c = x + y;
        System.out.println(c);
    }
    static void add(float x, float y) {
        float c = x + y;
        System.out.println(c);
    }
    //Dynamic Parameters in Method Overloading
    static void add(Integer ...num){
        int count =0;
        int c=0;

        for(int i=0;i< num.length;i++){
            System.out.println(count+" . "+num[i]);
            c+= num[i];
            count++;
        }
        System.out.println("Sum is"+" "+c);
    }

        public static void main (String[]args){
            add(10, 20);
            add(10.2f, 10.3f);
            add(1,2,3,4,5,6,7,8,9,10);
        }

}
