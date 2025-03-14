package day25_arrays;

public class C04_ArraydeElemanAratma {

    // Verilen int bir array’de
    // istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

    public static void main(String[] args) {

        int[] arr = {1,3,2,4,2,6,2,5,2,8,1,9,2};

        arraydeElemanAra(arr,3); // Aranan 3 sayisi array'de 1 adet var

        arraydeElemanAra(arr,2); // Aranan 2 sayisi array'de 5 adet var

        arraydeElemanAra(arr,11); // Aranan 11 sayisi array'de YOK
    }


    public static void arraydeElemanAra(int[] arr , int arananSayi){

        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == arananSayi) sayac++;
        }

        if (sayac == 0) System.out.println("Aranan "+arananSayi+" sayisi array'de YOK");
        else System.out.println("Aranan " + arananSayi + " sayisi array'de " + sayac + " adet var");

    }



}
