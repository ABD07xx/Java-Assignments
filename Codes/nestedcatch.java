public class nestedcatch {
    public static void main(String[] args) {
        float[] A = {10, 20, 30, 40, 0};
        for (int i = 0; i < A.length; i++) {

            try {
                float x = A[i] / A[i + 1];
                System.out.println("Division is " + x);


            } catch (ArithmeticException e) {
                System.out.println("Divided by zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array exceeded length");
            }
        }
        System.out.println("Bye");
    }
}