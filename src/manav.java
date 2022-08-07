import java.util.Scanner;

public class manav {
    public static void main(String[] args) {

        double elma = 3.67, armut = 2.14, domates= 1.11, muz= 0.95, patlican= 5.0;
        double secim, total = 0;
        double kg;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("1.Elma" +
                    "           2.Armut" +
                    "           3.Domates" +
                    "           4.Muz" +
                    "           5.Patlıcan" +
                    "           6.Borcum ne kadar abi?");
            System.out.println("Hangi meyveden/sebzeden istersiniz? (rakam giriniz)");
            secim = scan.nextInt();

            if (secim == 1) {
                secim = elma;

                System.out.println("Kaç kilo Elma istersiniz?");
                kg = scan.nextDouble();
                total += (kg * elma);

            } else if (secim == 2) {
                secim = armut;

                System.out.println("Kaç kilo Armut istersiniz?");
                kg = scan.nextDouble();
                total += (kg * armut);

            } else if (secim == 3) {
                secim = domates;

                System.out.println("Kaç kilo Domates istersiniz?");
                kg = scan.nextDouble();
                total += (kg * domates);

            } else if (secim == 4) {
                secim = muz;

                System.out.println("Kaç kilo Muz istersiniz?");
                kg = scan.nextDouble();
                total += (kg * muz);

            } else if (secim == 5) {
                secim = patlican;

                System.out.println("Kaç kilo Patlıcan istersiniz?");
                kg = scan.nextDouble();
                total += (kg * patlican);

            } else {
                System.out.println("Lütfen 1-5 arası bir rakam seçiniz.");
            }
        } while ( secim != 6) ;

        System.out.println("Toplam borcunuz : " + total);
    }
}
