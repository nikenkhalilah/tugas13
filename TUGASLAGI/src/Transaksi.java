import java.util.Scanner;

public class Transaksi implements Login {
    String password = "niken10";
    String captcha = "2RNo12J";
    String masukkanSandi;
    String masukkanCaptcha;

    //Login
    public void login(){
        Scanner scanner = new Scanner(System.in);


    //Captcha
        System.out.println("Kode = " + captcha);
        System.out.println("Masukkan captcha");
        masukkanCaptcha = scanner.next();

        while(!masukkanCaptcha.equalsIgnoreCase(captcha)){
            System.out.println("Invalid Kode\n");
            System.out.println("Masukkan captcha");
            masukkanCaptcha = scanner.next();
        scanner.close();
        }

    //Password
        System.out.println("Masukkan Password");
        masukkanSandi = scanner.next();

        while(!masukkanSandi.equals(password)){
            System.out.println("Incorrect Password\n");
            System.out.println("Input password : ");
            masukkanSandi = scanner.next();
        }
        
        System.out.println("\n\n");


    }
}
