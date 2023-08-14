package forLoop;

public class forLoopEx15 {
    public static void main(String args[]){
        int count=0;
        for(int i=1;i<=25;i++){
            if(i%2==1){
                count++;
            }
        }
        System.out.println("Number of odd number= "+count);
    }
}
