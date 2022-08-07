import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password, newPassword;
        int secim = 0;

        System.out.print("UserName: ");
        userName = scan.nextLine();
        System.out.print("Password: ");
        password = scan.nextLine();

        if(userName.equals("erenUnal24") && password.equals("123456")){
            System.out.println("Başarıyla giriş yaptınız.");
        }else {
            System.out.println("Giriş yapamadınız.");
            System.out.println("Şifre yenilemek ister misiniz?\n1.Evet\n2.Hayır");
            secim = scan.nextInt();
        }
        if (secim==2){
                System.out.println("Çıkış yapıldı");

        } else if (secim==1){
            System.out.println("Yeni şifreyi giriniz");
            scan.nextLine();
            newPassword = scan.nextLine();
            if (newPassword==password) { // çalışmıyor
                System.out.println("Girdiğin şifre eskisiyle aynı. \nLütfen farklı bir şifre gir");
            }
            else {
                System.out.println("Şifren başarıyla değişti.");
            }

        }



    }
}
