public class Main {
    public static void main(String[] args) {
    //Implicit Type Conversion
        int x = 10;
        float y = x;
    //Done by java compiler on its own
        //Explicit type conversion if not done by the user will show an error used to avoid lossy conversions.

        float a = 10.09f;
        float b =  a;
        float c = a+b;
        System.out.println(c);
    }
}