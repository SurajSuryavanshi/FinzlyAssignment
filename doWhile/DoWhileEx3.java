package doWhile;

public class DoWhileEx3 {
    public static void main(String[] args) {
        int i = 1;
        System.out.print("Odd Numbers: ");
        do {
            if(i%2==1){
                System.out.print(i + " ");
            }
            i++;
        } while (i<=100);
    }
}
