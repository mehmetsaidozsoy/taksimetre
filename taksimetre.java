import java.util.Scanner;;
public class taksimetre{
    public static void main(String[] args) {
        int mesafe=0 , takAc=10 ;
        double ucret=0.0;
    Scanner input=new Scanner(System.in);
    System.out.print("Gidilen mesafeyi km olarak giriniz  :");
    mesafe=input.nextInt();
    ucret=takAc+ (mesafe*2.20);
    ucret=ucret<20 ? ucret=20: null;



    }
}