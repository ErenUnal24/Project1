import java.util.Scanner;
public class alan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c, u, alan;

        System.out.println("Bir üçgen için A kenarını giriniz: ");   //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        a = scan.nextInt();                                          //𝑢 = (a+b+c) / 2
                                                                     //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        System.out.println("B kenarını giriniz: ");
        b = scan.nextInt();

        System.out.println("C kenarını giriniz: ");
        c = scan.nextInt();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u -c));

        System.out.println("Üçgenin Alanı: " + alan );

    }
}
