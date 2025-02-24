package day11_switchStatement_stringManipulations;

import java.util.Scanner;

public class C04_YuzdenKucukPozitifSayiYazdirma {

    public static void main(String[] args) {

        // kullanicidan yuzden kucuk pozitif bir tamsayi isteyin
        // girilen sayiyi yazi ile yazdirin
        // orn input : 17 , output : Onyedi
        // 0-99 arasindaki sayilar disinda sayi yazarsa hata mesaji verin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();
        String mesaj = "";

        // 17  ==> onlar basamagi 1 ==> On  ve  birler basamagi 7 ==> Onyedi
        // 54  ==> onlar basamagi 5 ==> Elli  ve  birler basamagi 4 ==> Ellidort

        int birlerBasamagindakiRakam = sayi % 10 ;
        int onlarBasamagindakiRakam = sayi / 10;


        if (sayi<=0 || sayi>=100){
            System.out.println("Girilen sayi 100'den kucuk pozitif bir tamsayi olmaliydi");
        } else { // burasi 2 basamakli pozitif sayilar bolgesi

            // once sayinin onlar basamagini bulup yaziya cevirelim
            switch (onlarBasamagindakiRakam) {
                case 0:

                    break;
                case 1:
                    mesaj = "On";
                    break;
                case 2:
                    mesaj = "Yirmi";
                    break;
                case 3:
                    mesaj = "Otuz";
                    break;
                case 4:
                    mesaj = "Kirk";
                    break;
                case 5:
                    mesaj = "Elli";
                    break;
                case 6:
                    mesaj = "Altmis";
                    break;
                case 7:
                    mesaj = "Yetmis";
                    break;
                case 8:
                    mesaj = "Seksen";
                    break;
                case 9:
                    mesaj = "Doksan";

            }


            // sonra birler basamagindaki sayiyi onlarbasamaginin yanina ekleyelim

            switch (birlerBasamagindakiRakam) {
                case 0:
                    break;
                case 1:
                    mesaj += "bir";
                    break;
                case 2:
                    mesaj += "iki";
                    break;
                case 3:
                    mesaj += "üç";
                    break;
                case 4:
                    mesaj += "dört";
                    break;
                case 5:
                    mesaj += "beş";
                    break;
                case 6:
                    mesaj += "altı";
                    break;
                case 7:
                    mesaj += "yedi";
                    break;
                case 8:
                    mesaj += "sekiz";
                    break;
                case 9:
                    mesaj += "dokuz";
            }


        }

        System.out.println(mesaj);
    }

}
