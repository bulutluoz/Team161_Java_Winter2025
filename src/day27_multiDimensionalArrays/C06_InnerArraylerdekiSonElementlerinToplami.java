package day27_multiDimensionalArrays;

public class C06_InnerArraylerdekiSonElementlerinToplami {

    public static void main(String[] args) {

        int[][] sayilar = {{3,5,4},{2,3,6,8},{2,4},{10},{3,9,0,2,7}};

        // herbir inner array'deki son elementlerin toplamini yazdirin
        // 4 + 8 + 4 + 10 + 7 ==> 33

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i][ sayilar[i].length -1 ];

        }

        System.out.println("son elementlerin toplami : " + toplam); // 33

    }
}
