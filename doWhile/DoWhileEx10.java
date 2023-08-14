package doWhile;

public class DoWhileEx10 {
    public static void main(String args[]){
        int num1=1;
        System.out.print("Even Numbers: ");
        do {
            if (num1 % 2 == 0) {
                System.out.print(num1 + " ");
            }
            num1++;
        } while (num1 <= 100);
        System.out.println();
        System.out.print("Odd numbers:");
        int num2 = 1;
        do {
            if (num2 % 2 != 0) {
                System.out.print(num2 + " ");
            }
            num2++;
        } while (num2 <= 100);
        System.out.println();
    }

}
