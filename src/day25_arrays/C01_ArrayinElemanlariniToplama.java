package day25_arrays;

public class C01_ArrayinElemanlariniToplama {

    public static void main(String[] args) {

        // verilen int bir array'in tum elementlerini toplayip
        // toplam degerini yazdirin

        int[] sayilar = {3,5,7,1,2,4};

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i];
        }

        System.out.println("Array'deki elemanlarin toplami : " + toplam);

    }


    // verilen int bir array'in tum elementlerini toplayip
    // toplam degerini yazdiran bir method olusturun

    public static void elementToplaminiYazdir(int[] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i];
        }

        System.out.println("Array'deki elemanlarin toplami : " + toplam);
    }


    // verilen int bir array'in tum elementlerini toplayip
    // toplam degerini donduren bir method olusturun

    public static int getElementlerinToplami(int[] arr){
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i];
        }

        return toplam;
    }

}
