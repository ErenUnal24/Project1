import java.util.Scanner;
public class ucVeDortIleTamBolunen {
    public static void main(String[] args) {
        int n, i, c = 0;
        int t = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (i = 1; i <= n; i++){
            if (i % 12 == 0){
                t += i;
                c++;
            }
        }
        System.out.println("ortalama: " + t/c);
    }
}
