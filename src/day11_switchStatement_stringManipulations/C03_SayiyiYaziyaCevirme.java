package day11_switchStatement_stringManipulations;

import java.util.Scanner;

public class C03_SayiyiYaziyaCevirme {

    public static void main(String[] args) {

        // kullanicidan bir rakam isteyin
        // girilen rakami yazi ile yazdirin
        // orn input : 7 , output : yedi
        // 0-9 arasindaki sayilar disinda sayi yazarsa hata mesaji verin

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir rakam girelim:");
        int rakam = scanner.nextInt();
        String mesaj = " ";
        switch (rakam) {
            case 0:
                mesaj = "sifir";
                break;
            case 1:
                mesaj = "bir";
                break;
            case 2:
                mesaj = "iki";
                break;
            case 3:
                mesaj = "üç";
                break;
            case 4:
                mesaj = "dört";
                break;
            case 5:
                mesaj = "beş";
                break;
            case 6:
                mesaj = "altı";
                break;
            case 7:
                mesaj = "yedi";
                break;
            case 8:
                mesaj = "sekiz";
                break;
            case 9:
                mesaj = "dokuz";
                break;
            default:
                mesaj = "Girilen sayi rakam olmali.";
        }
        System.out.println(mesaj);
    }
}
