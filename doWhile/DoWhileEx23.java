package doWhile;

public class DoWhileEx23 {
    public static void main(String[] args) {
        int a=0,b=1,fib,i=1;
        do {
            System.out.print(a + " ");
            fib = a + b;
            a = b;
            b = fib;
            i++;
        }
        while (i <= 9);
    }
}
