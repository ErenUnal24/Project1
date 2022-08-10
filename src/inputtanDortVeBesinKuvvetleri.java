import java.util.Scanner;
public class inputtanDortVeBesinKuvvetleri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, n;
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        System.out.print("4'ün " + n + "'e kadar olan kuvvetleri :");
        for (i = 1; i <= n; i *= 4) {
            System.out.print(i + ", ");
        }

        System.out.println("");
        System.out.println("-----------------------");

        System.out.print("5'in " + n + "'e kadar olan kuvvetleri :");
        for (i = 1; i <= n; i *= 5) {
            System.out.print(i + ", ");
        }
    }
}
