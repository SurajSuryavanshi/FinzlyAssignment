package Test1;

 class Antivirus{
    private String productKey;
    public Antivirus(String productKey){
        this.productKey=productKey;
    }
    public void Antivirus(){
        if(productKey!=null && productKey.equals("123456")){
            System.out.println("Antivirus activated Successfully....");

        }else {
            System.out.println("You are using free version,Please Upgrade :( ");
        }
    }
}
public class FinalConstructor {
    public static void main(String[]args){
        Antivirus A1=new Antivirus(null);
        A1.Antivirus();
        Antivirus A2=new Antivirus("123456");
        A2.Antivirus();
        Antivirus A3=new Antivirus("ABC123");
        A3.Antivirus();
    }
}
