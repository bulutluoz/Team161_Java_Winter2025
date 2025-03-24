package day31_forEachLoop;

public class C09_ParametresizConstructor {

    int sayi = 20;
    String isim = "Ali Can";


    C09_ParametresizConstructor(){

        sayi +=20;
        isim = isim.substring(0,3);
    }

    public static void main(String[] args) {

        C09_ParametresizConstructor obj = new C09_ParametresizConstructor();

        System.out.println(obj.isim); // Ali
        System.out.println(obj.sayi); // 40

    }
}
