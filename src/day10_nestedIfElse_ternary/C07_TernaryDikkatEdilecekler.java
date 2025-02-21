package day10_nestedIfElse_ternary;

public class C07_TernaryDikkatEdilecekler {

    public static void main(String[] args) {


        int sayi = 17;

        // 1- ternary MUTLAKA BIR SONUC URETIR
        //    bu sonucu YA yazdirmali veya bir variable'a ATAMALISINIZ
        //    SADECE ternary operatorunu yazarsaniz Java hata verir

        // sayi > 20 ? sayi+10 : sayi-10;

        System.out.println(   sayi > 20 ? sayi+10 : sayi-10 );

        sayi = sayi > 20 ? sayi+10 : sayi-10;

        int b = sayi > 20 ? sayi+10 : sayi-10;


        // 2- Ternary'nin sonucunu YAZDIRACAKSAK
        //    true veya false durumlarinda alacagi degerin data turu onemli degildir
        //    AMMMAAAA atama yapacaksak
        //    true veya false durumlarinda alacagi degerin data turu ayni olmalidir

        sayi = 26;

        // verilen sayiyi kontrol edip
        // sayi ciftse "Sayi cift" yazdirin,
        // sayi cift degilse sayinin 10 fazlasini yazdirin

        System.out.println(  sayi % 2 == 0 ? "Sayi cift" : sayi+10    );


        // Ayni ternary'nin sonucunu bir variable'a kaydedin

        // int sonuc  = sayi % 2 == 0 ? "Sayi cift" : sayi+10 ;

        // String sonuc  = sayi % 2 == 0 ? "Sayi cift" : sayi+10 ;


    }
}
