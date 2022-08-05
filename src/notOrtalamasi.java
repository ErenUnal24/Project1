import java.util.Scanner;
public class notOrtalamasi {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 1. dersten aldığınız notu ve dersin katsayısını giriniz: ");
        double n1 = input.nextDouble();
        double k1 = input.nextDouble();
        double kn1 = k1 * n1;

        System.out.println("Lütfen 2. dersten aldığınız notu ve dersin katsayısını giriniz: ");
        double n2 = input.nextDouble();
        double k2 = input.nextDouble();
        double kn2 = k2 * n2;

        System.out.println("Lütfen 3. dersten aldığınız notu ve dersin katsayısını giriniz: ");
        double n3 = input.nextDouble();
        double k3 = input.nextDouble();
        double kn3 = k3 * n3;

        System.out.println("Lütfen 4. dersten aldığınız notu ve dersin katsayısını giriniz: ");
        double n4 = input.nextDouble();
        double k4 = input.nextDouble();
        double kn4 = k4 * n4;

        double toplamKatsayi = k1 + k2 + k3 + k4;
        double toplamNot = kn1 + kn2 + kn3 + kn4;
        double ortalama = toplamNot/toplamKatsayi;
        System.out.println("Not ortalamanız: " + ortalama);
    }
}
