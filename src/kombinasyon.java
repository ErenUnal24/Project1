import java.util.Scanner;
public class kombinasyon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, r, i, j, k, total1 = 1, total2 = 1, total3 = 1;
        double c;

        System.out.print("n giriniz: ");
        n = input.nextInt();
        System.out.print("r giriniz: ");
        r = input.nextInt();

        if (n<0 || r<0) {
            System.out.println("Lütfen pozitif sayılar girin.");
        } else {

            for (i=1; i<=n; i++){
                total1 *= i;
            }
            for (j=1; j<=r; j++){
                total2 *= j;
            }
            for (k=1; k <= n-r; k++){
                total3 *= k;
            }

            c = total1 / (total2*total3);

            System.out.println("C(" + n + "," + r + ") kombinasyonu = " + c + "dir.");
            System.out.println(total1);
            System.out.println(total2);
        }
    }
}
