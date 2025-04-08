package day40_stringBuilder_accessModifier;

public class C01_StringBuilderKarsilastirma {

    public static void main(String[] args) {

        String str = "Ali";
        StringBuilder sb1 = new StringBuilder("Ali");
        StringBuilder sb2 = new StringBuilder("Ali");


        // 1- == ile karsilastirma

        // System.out.println(  str == sb1   );
        // Operator '==' cannot be applied to 'String', 'StringBuilder'
        // Java'da farkli data turlerindeki non-primitive'ler == ile KARSILASTIRILAMAZ
        // karsilastirilirsa CTE verir

        Integer sayi1 = 20;
        Short sayi2 = 20;

        // System.out.println(sayi1 == sayi2);
        //   Operator '==' cannot be applied to 'Integer', 'Short'


        System.out.println(sb1 == sb2); // false
        // Java 2 StringBuilder'in == ile karsilastirilmasina itiraz etmez
        // Amma farkli 2 StringBuilder karsilastirildiginda
        // degerleri AYNI olsa BILE sonuc false olur
        // SADECE bir StringBUilder kendisi ile karsilastirilirsa sonuc true olur

        System.out.println(sb1 == sb1 ); // true


        // equals ile karsilastirma

        System.out.println( sb1.equals(str)  ); // false
        // 'equals' between objects of inconvertible types 'StringBuilder' and 'String'
        // Bir StringBuilder ile bir String equals() ile karsilastirilirsa
        // Java itiraz etmez ama sonuc her zaman false olur


        System.out.println(sb1.equals(sb2)); // false
        // Suspicious call to 'equals()' on 'StringBuilder' object
        // farkli 2 StringBuilder equals() ile karsilastirildiginda
        // degerleri AYNI olsa BILE sonuc false olur
        // SADECE bir StringBUilder kendisi ile karsilastirilirsa sonuc true olur

        System.out.println(sb1.equals(sb1)); // true



        // compareTo()  ile karsilastirma
        StringBuilder sb3 = new StringBuilder("Hava");
        StringBuilder sb4 = new StringBuilder("Tava");
        StringBuilder sb5 = new StringBuilder("HAVA");
        StringBuilder sb6 = new StringBuilder("Hata");



        System.out.println(sb1.compareTo(sb2)); // 0   Ali <==> Ali ==> 0
        System.out.println(sb3.compareTo(sb4)); // -12  Hava <==> Tava ==> H I J K L M N O P Q R S T
        System.out.println(sb3.compareTo(sb5)); // 32   Hava <==> HAVA ==> H-H  a ..... A
        System.out.println(sb3.compareTo(sb6)); // 2    Hava <==> Hata ==> H-H a-a  v u t
        System.out.println(sb4.compareTo(sb5)); // 12   Tava <==> HAVA ==> T ... H
        System.out.println(sb4.compareTo(sb6)); // 12   Tava <==> Hata ==> T ... H


        // StringBuilder'lari METIN OLARAK karsilastirmak icin
        // compareTo() kullanilir
        // compareTo() == 0 ise verilen StringBUilder'lar ayni metne sahip
        // compareTo() != 0 ise verilen StringBUilder'lar farkli metne sahip

        // System.out.println(sb1.compareTo(str));
        // String parametre kabul etmez


    }
}
