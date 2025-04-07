package day39_varargs_stringBuilder;

public class C06_StringBuilderOlusturma {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        // bos ve kapasitesi 16 olan bir StringBuilder olusturur
        System.out.println("sb1 : " + sb1); // hiclik
        System.out.println("sb1 uzunlugu : " + sb1.length()); // 0
        System.out.println("sb2 kapasite : " + sb1.capacity() ) ; // 16


        StringBuilder sb2 = new StringBuilder(10);
        // 10 karakter alabilecek bir StringBuilder olusturur
        System.out.println("sb2 : " + sb2); // hiclik
        System.out.println("sb2 uzunlugu : " + sb2.length()); // 0
        System.out.println("sb2 kapasite : " + sb2.capacity() ) ; // 10


        StringBuilder sb3 = new StringBuilder("Java Candir");
        //  alabilecek bir StringBuilder olusturur
        System.out.println("sb3 : " + sb3); // Java Candir
        System.out.println("sb3 uzunlugu : " + sb3.length()); // 11
        System.out.println("sb3 kapasite : " + sb3.capacity() ) ; // 16 + 11 ==> 27



        // bos bir StringBuilder'a sonradan metin eklemek icin

        // sb1 = "Deneme";
        // direkt olarak bir metin degeri atayamayiz

        // sb1 = new StringBuilder("Ali Can");
        // atama yapabilirsiniz ammmaaaa
        // gereksiz yere bir obje daha olusturulmus olur

        sb1.append("Java Kraldir");

        System.out.println("sb1 : " + sb1); // Java Kraldir
        System.out.println("sb1 uzunlugu : " + sb1.length()); // 12
        System.out.println("sb2 kapasite : " + sb1.capacity() ) ; // 16


        sb1.append(",bunu herkes bilsin.");

        System.out.println("sb1 : " + sb1); // Java Kraldir,bunu herkes bilsin.
        System.out.println("sb1 uzunlugu : " + sb1.length()); // 32
        System.out.println("sb2 kapasite : " + sb1.capacity() ) ; // 16 * 2 + 2 ==> 34

        sb1.append("Duymasin kalmasin.");
        System.out.println("sb1 : " + sb1); // Java Kraldir,bunu herkes bilsin.Duymasin kalmasin.
        System.out.println("sb1 uzunlugu : " + sb1.length()); // 32 + 18==> 50
        System.out.println("sb2 kapasite : " + sb1.capacity() ) ; // 34 * 2 + 2 ==> 70


        // eger capasite ve length'i esitlemek isterseniz

        sb1.trimToSize();
        System.out.println("sb1 : " + sb1); // Java Kraldir,bunu herkes bilsin.Duymasin kalmasin.
        System.out.println("sb1 uzunlugu : " + sb1.length()); // 32 + 18==> 50
        System.out.println("sb2 kapasite : " + sb1.capacity() ) ; // 50



    }
}
