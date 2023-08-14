package doWhile;

public class DoWhileEx21 {
    public static void main(String[] args) {
        int i = 1;
        int num=1;
        do {
            System.out.print(num + " ");
            num =num+i+1;
            i++;
        } while (num <= 45);
    }
}
