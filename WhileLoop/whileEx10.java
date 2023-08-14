package WhileLoop;

public class whileEx10 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Even numbers:");
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("Odd numbers:");
        int m = 1;
        while (m <= 100) {
            if (m % 2 != 0) {
                System.out.print(m + " ");
            }
            m++;
        }
        System.out.println();


    }
}
