import java.util.Scanner;
public class kdv {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double kdv, bill, total, x;

        System.out.println("Lütfen bir değer giriniz.");
        bill = scan.nextDouble();
        if (bill > 1000) {
            kdv = 0.8;
        } else {
            kdv = 0.18;
        }

        x = bill * kdv;
        total = bill + x;
        System.out.println(total);
    }
}
