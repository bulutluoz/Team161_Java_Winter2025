package day27_multiDimensionalArrays;

public class C03_CiftSayilarinToplami {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
        // sonucu yazdiran bir method olusturun.

        int[][] sayilar = {{3,5,4},{2,3,6,8},{2,4},{10},{3,9,0,2,7}};

        ciftSayilariTopla(sayilar);
        // Array'deki cift sayilarin toplami : 38

    }

    public static void ciftSayilariTopla(int[][] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) { // outer array

            for (int j = 0; j <arr[i].length ; j++) { // inner array'leri

                if (arr[i][j] % 2 == 0){
                    toplam += arr[i][j] ;
                }
            }
        }

        System.out.println("Array'deki cift sayilarin toplami : " + toplam);
    }

}
