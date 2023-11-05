
public class ExceptionExample {
    public static void main(String[] args) {
        // 1) Arithmetic Exception
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        }

        // 2) ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            int value = arr[10]; // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        }

        // 3) NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
        }

        // 4) ClassNotFoundException
        try {
            Class.forName("NonExistentClass"); // This will throw a ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e);
        }
    }
}
 
