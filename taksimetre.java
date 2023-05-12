import java.util.Scanner;;
public class taksimetre{
    public static void main(String[] args) {
        int mesafe=0 , takAc=10 ;
        double ucret=0.0;
    try (Scanner input = new Scanner(System.in)) {

        System.out.print("Gidilen mesafeyi km olarak giriniz  :");
        if (input.hasNextInt()) {
            mesafe=input.nextInt();
        }else{
            System.out.print("HAtalı giriş yapıldı lütfen bir sayı giriniz.");
        }
    }
    ucret=takAc+ (mesafe*2.20);
    ucret=ucret<20 ? 20.0: ucret;
    System.out.print("Gidilen mesafeyi tutarı :"+ucret);

    }
}