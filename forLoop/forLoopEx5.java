package forLoop;

public class forLoopEx5 {
    public static void main(String args[]){
        int sum=0;
        for(int i=1;i<=50;i++){
            if(i%2==1){
                sum=sum+i;
            }
        }
        System.out.println("Sum of 50 odd numbers= "+sum);
    }
}
