package day25_arrays;

public class C03_PozitifSayilarinToplami {

    // Verilen int bir array’deki pozitif tamsayilari toplayip
    // sonucu donduren bir method yaziniz.

    public static void main(String[] args) {

        // int[] arr = {1,-3,4,-5,2,-7};
        // System.out.println(getPozitifElemanlarinToplami(arr));
        // bize verilen gorevde sadece method olusturma var
        // biz method'u olusturdugumuzda gorevimiz biter
        // gorevde yoksa main method olusturmak, main method icinde bir array olusturmak
        // ve bu array ile method'u denemek gereksizdir

        // biz yazdigimiz kodun calistigini gormek icin
        // main method olusturup, deneme yapabiliriz
        // ancak gorevde istenmedigi icin denemeden sonra main method ve bizim denememizi silmek
        // daha dogru olur

    }

    public static int getPozitifElemanlarinToplami(int[] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            if ( arr[i] > 0 ){
                toplam += arr[i];
            }

        }

        return toplam;
    }
}
