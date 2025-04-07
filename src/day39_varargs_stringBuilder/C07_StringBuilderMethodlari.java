package day39_varargs_stringBuilder;

public class C07_StringBuilderMethodlari {

    public static void main(String[] args) {
        // StringBuilder mutable oldugu icin
        // StringBuilder donduren method'larla yapilan degisiklikler kalici olur

        StringBuilder sb1 = new StringBuilder();

        sb1.append("Ali ");
        System.out.println(sb1); // Ali

        sb1.append(10).append('s').append(true).append("10.1");

        System.out.println(sb1); // Ali10strue10.1


        System.out.println(  sb1.reverse() ); // 1.01eurts01 ilA

        System.out.println(sb1); // 1.01eurts01 ilA

        // tekrar duzenlemek icin yine reverse yapabiliriz
        sb1.reverse();
        System.out.println(sb1); // Ali 10strue10.1


        sb1.replace(0,3,"Veli");
        System.out.println(sb1); // Veli 10strue10.1

        // replace methodu String'de de vardi
        // ama ismi ayni olsa da kullanimi farkli olabilir


        System.out.println(sb1.deleteCharAt(10)); // Veli 10stre10.1
        System.out.println(sb1.delete(4,sb1.length())); // Veli

        System.out.println(sb1.insert(2, " ")); // Ve li
        System.out.println(sb1.insert(5, " Can")); // Ve li Can

        String str = "Java Candir";
        System.out.println(sb1.insert(2, str, 0, 4)); // VeJava li Can


    }
}
