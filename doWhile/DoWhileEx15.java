package doWhile;

public class DoWhileEx15 {
    public static void main(String[] args) {
        int i = 1;
        int count=0;
        do {
            if(i%2!=0){
                count++;
            }
            i++;
        } while (i<=25);
        System.out.print("Number of Odd Numbers: "+count);

    }
}
