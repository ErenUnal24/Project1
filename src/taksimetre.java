import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int km;
        double perKm = 2.20, total, startPrice = 10;

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = scan.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total <20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);


    }

}
