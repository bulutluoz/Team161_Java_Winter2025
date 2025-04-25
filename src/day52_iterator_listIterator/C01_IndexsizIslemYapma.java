package day52_iterator_listIterator;

import java.util.Arrays;

public class C01_IndexsizIslemYapma {

    public static void main(String[] args) {

        /*
            Array ve arrayList'ler index destekledigi icin
            array ve array list'in elemanlarinda kalici degisiklik yapmak istedigimizde
            index kullanan for loop kullanabiliriz

            AMMMMAAAAA
            java'da array ve arrayList disinda da
            coklu eleman barindiran yapilar vardir
            VEEE bunlardan bazilari INDEX kullanmaz

            index kullanmadan tum elemanlari ele alabilecegimiz
            su ana kadar ogrendigimiz for-each loop var
            ANNNCAAAKKK for-each loop ile kalici degisiklikler yapamayabiliriz

            Bu durumda INDEX kullanmadan
            KALICI degisiklik yapabilecek
            bir yapiya ihtiyacimiz var
         */

        int[] arr = {2,3,4,5,6};

        // index kullanmadan arr'deki tum sayilarin toplamini bulun

        int toplam = 0;

        for(int each:arr){
            toplam += each;
        }

        System.out.println("Sayilarin toplami : " + toplam); // 20

        // index kullanmadan tum elemanlari 2 artirin

        for (int each:arr){

            each += 2;
            System.out.print(each + " ");

        } // 4 5 6 7 8


        System.out.println("\nFor each loop'dan sonra : " + Arrays.toString(arr));



    }
}
