package day31_forEachLoop;

public class C08_ParametresizConstructor {

    /*
        Default constructor
            - Java tarafindan olusturulur
            - Gorunmez
            - parametresi yoktur
            - body'sinde kod olmaz
     */

    C08_ParametresizConstructor(){
        sayi = 30;
    }

    // parametresiz constructor'i kod yazanlar tarafindan olusturulur
    // parametresi yoktur
    // body'sinde kod olabilir

    int sayi = 10;
    int num= 20;


    public static void main(String[] args) {

        C08_ParametresizConstructor obj1 = new C08_ParametresizConstructor();

        System.out.println(obj1.sayi); // 30
        System.out.println(obj1.num); // 20





    }

}
