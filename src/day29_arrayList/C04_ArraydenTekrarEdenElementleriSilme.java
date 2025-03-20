package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarEdenElementleriSilme {

    public static void main(String[] args) {

        //  Verilen Integer bir array’de
        //  tekrar eden elementler icin, mukerrer olanlari silip,
        //  tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        Integer[] arr = {3,5,6,8,2,3,5,1,4,8,6,2,3,4,8,1,-1,-1,-1};

        arr = getTekrarsizArray(arr);

        System.out.println(Arrays.toString(arr));





    }


    //  Verilen bir array’de
    //  tekrar eden elementler icin, mukerrer olanlari silip,
    //  tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

    public static Integer[] getTekrarsizArray(Integer[] arr){


        // array hem eleman ekleme konusunda rijit, hem de contains() 'na sahip degil
        // bunun yerine gecici olarak bir arrayList olusturalim

        List<Integer> tekrarsizList = new ArrayList<>();  // []

        // array'deki tum elementleri tek tek ele alalim
        // tekrarsizList'de olmayanlari listeye ekleyelim

        for (int i = 0; i < arr.length ; i++) {

            if ( ! tekrarsizList.contains(arr[i])  ){
                tekrarsizList.add(arr[i]);
            }

        }

        // System.out.println("Tekrarsiz List : " + tekrarsizList);
        // Tekrarsiz List : [3, 5, 6, 8, 2, 1, 4]
        // elemanlari tekrarsiz hale List olarak getirdik
        // ancak bize verilen gorev arr'yi tekrarsiz hale getirmek

        // arr = tekrarsizList.toArray(new Integer[0]);

        arr = new Integer[tekrarsizList.size()]; // [0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizList.get(i);
        }



        //System.out.println("Arr'nin son hali : " + Arrays.toString(arr));
        // arr ==> [3,5,6,8,2,1,4]

        return arr;
    }

}
