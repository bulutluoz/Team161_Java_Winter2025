package day14_stringmanipulations;

public class C02_ReplaceAll {

    public static void main(String[] args) {

        String str = "Java ile kodlama cok guzel";

        System.out.println(str.replace("a", ""));
        // Jv ile kodlm cok guzel

        System.out.println(str.replaceAll("a", "A"));
        // JAvA ile kodlAmA cok guzel

        /*
            Eger verilen metinde
            verilen bir metin parcasini yeni bir metin ile degistireceksek
            replace() ve raplaceAll() ayni islevi gorur
         */

        // butun "a" ve "e" 'leri buyuk harfe cevirin

        System.out.println(str.replaceAll("a", "A").replaceAll("e", "E"));
        // JAvA ilE kodlAmA cok guzEl

        System.out.println(str.replace('a', 'A').replace('e', 'E'));
        // JAvA ilE kodlAmA cok guzEl

        System.out.println(str.replace("a", "A").replace("e", "E"));
        // JAvA ilE kodlAmA cok guzEl



        str = "Ja67va 89C90a54n34d76i12r";
        // verilen str'da butun sayilari yok edin

        System.out.println(str.replaceAll("\\d", ""));  // Java Candir


    }
}
