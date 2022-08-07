import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double i1, i2;
        int select;

        System.out.print("ilk sayıyı giriniz:");
        i1 = scan.nextDouble();

        System.out.print("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        select = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        i2 = scan.nextDouble();

        switch (select){
            case 1:
                System.out.println(i1 + i2);
                break;
            case 2:
                System.out.println(i1 - i2);
                break;
            case 3:
                System.out.println(i1 * i2);
                break;
            case 4:
                System.out.println(i1 / i2);
                break;
            default:
                System.out.println("Yanlış bir değer giridniz.");
        }


    }
}
