package day39_varargs_stringBuilder;

public class C04_VarargsDikkatEdilecekler {

    public static void main(String[] args) {

        // Kac tane argument yazarsak yazalim
        // son argument haric geriye kalanlari toplayip
        // bulunan toplam ile son argumanin carpimini yazdiran bir method olusturun
        // orn:  2,3,4 ==>   output (2+3) * 4 ==> 20

        islemYap(); // tumArgumentler==> []  Verilen argumentler islem icin yeterli degil
        islemYap(2); // tumArgumentler==> [] Verilen argumentler islem icin yeterli degil
        islemYap(2,3); // islem sonucu : 6
        islemYap(1,2,3); // islem sonucu : 9
        islemYap(1,2,3,4,5,6,7); // islem sonucu : 147


    }

    /*
    public static void islemYap(int... bastakiSayilar , String sonSayi){

    }

    Varargs devreye girdikten sonra
    tum argumentleri almak ister
    bu sebeple varargs'da dikkat etmemiz gereken EN ONEMLI SEY

    bir method'da parametre olarak varargs varsa
    EN SONDA olmalidir

    bu kurala gore dusunursek
    bir method'da birden fazla varargs parametre OLAMAZ
     */

    // bu soruyu varargs ile cozmek icin
    // tum argumentleri tek bir varargs'a alip
    // son elementi varargs icinden secebiliriz

    public static void islemYap(int... tumArgumentler){
        int toplam = 0;
        int sonEleman = 0 ;

        if (tumArgumentler.length<2){
            System.out.println("Verilen argumentler islem icin yeterli degil");
        } else {

            sonEleman = tumArgumentler[tumArgumentler.length-1];
            toplam = 0;

            for (int i = 0; i < tumArgumentler.length-1 ; i++) {

                 toplam += tumArgumentler[i];
            }

            System.out.println("islem sonucu : " + toplam*sonEleman);
        }



    }
}
