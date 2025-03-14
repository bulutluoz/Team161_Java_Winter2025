package day25_arrays;

public class C02_EnBuyukElemaniBulma {

    public static void main(String[] args) {
        /*
            Eger verilen gorevi yapmak icin
            tum elementleri gozden gecirmemiz gerekiyorsa
            for loop kullaniriz
         */

        // verilen int bir array'deki en buyuk elemani yazdirin

        int[] sayilar = {-2,-5,-7,-11,-4};

        int enBuyukEleman = sayilar[0];

        for (int i = 0; i < sayilar.length ; i++) {

            if ( sayilar[i] > enBuyukEleman  ){
                enBuyukEleman = sayilar[i];
            }
        }

        System.out.println("Array'deki en buyuk eleman : " + enBuyukEleman);

    }



    // verilen int bir array'deki en buyuk elemani donduren bir method olusturun
    public static int getEnBuyukEleman(int[] arr){
        int enBuyukEleman = arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if ( arr[i] > enBuyukEleman  ){
                enBuyukEleman = arr[i];
            }
        }

        return enBuyukEleman;
    }



}
