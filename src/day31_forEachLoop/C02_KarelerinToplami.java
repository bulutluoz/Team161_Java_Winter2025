package day31_forEachLoop;

public class C02_KarelerinToplami {

    public static void main(String[] args) {
        // Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[] sayilar = {1,0,1,0,1};
        karelerinToplami(sayilar); // 3

        int[] numbers = {1,2,3,-1,-2};
        karelerinToplami(numbers); // 19

    }

    public static void karelerinToplami(int[] arr){

        int toplam = 0;

        for (int each:arr){

            toplam += each*each ;
        }

        System.out.println("Array'deki elementlerin kareleri toplami : " + toplam);
    }
}
