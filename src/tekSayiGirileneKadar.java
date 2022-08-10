import java.util.Scanner;
public class tekSayiGirileneKadar {

    public static void main(String[] args) {
        int n, i;
        int t = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Bir sayı giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                t += n;
            }
        } while (n % 2 == 0);

        System.out.println("4'ün katı olan sayıların toplamı: " + t);
    }
}
