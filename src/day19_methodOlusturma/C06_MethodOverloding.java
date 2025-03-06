package day19_methodOlusturma;

public class C06_MethodOverloding {

    public static void main(String[] args) {



        String str = "Java ile hersey mumkun";

        System.out.println(str.substring(10)); // ersey mumkun


        System.out.println(str.substring(2,7)); // va il

        /*
            Ayni isimde ama farkli isleve sahip method'lar olabilir
            Java hangi method'u kullanacagina
            girdigimiz argumanlara gore karar verir

            ornegin 11. satirda 1 arguman girildigi icin
                    bu arguman ile uyumlu substring() calisti
                    Buna karsilik 14.satirda 2 arguman girilince
                    argumanlara uygun farkli bir substring() calistirildi
         */


    }
}
