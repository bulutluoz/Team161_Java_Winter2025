package day31_forEachLoop;

public class C01_ForEachLoop {


    public static void main(String[] args) {

        int[] arr = {3,5,7,1,2,5,8,1};

        // arr'deki tum elemanlarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i];
        }

        System.out.println("For loop ile elementlerin toplami : " + toplam);
        // For loop ile elementlerin toplami : 32

        // for-each loop "bana arr'deki tum int'lari getir" mantigiyla calisir
        toplam = 0;

        for (  int each : arr){
            toplam += each;
        }

        System.out.println("For-Each loop ile elementlerin toplami : " + toplam);


        // array'deki tum elementleri yan yana yazdirin

        for (int each:arr){
            System.out.print(each + " ");
        }

    }
}
