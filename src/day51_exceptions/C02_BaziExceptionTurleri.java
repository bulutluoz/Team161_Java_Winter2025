package day51_exceptions;

public class C02_BaziExceptionTurleri {

    public static void main(String[] args) {

        // 1- StringIndexOutOfBoundsException

        String str = "Java Candir";
        // System.out.println(str.charAt(23));
        // StringIndexOutOfBoundsException: String index out of range: 23


        // 2- ArrayIndexOutOfBoundsException

        String[] isimler = {"Ali","Veli"};
        // System.out.println(isimler[23]);
        // ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 2


        // 3- ArithmeticException

        // System.out.println( 6 / 0 );
        // ArithmeticException: / by zero


        // 4- FileNotFoundException
        //    bilgisayardan bir dosyaya ulasmak istediginde, dosyayi bulamazsa


        // 5- IO Exception
        //    Dosyadan bilgi okuma ve dosyaya bilgi ekleme ile ilgili tum exception'larin parent'i


        // 6- NullPointerException
        String a = "";
        String b ;
        String c = null;

        // System.out.println(b); // Variable 'b' might not have been initialized

        // System.out.println(c.length()); // NullPointerException
        // null olarak isaretlenen bir String yazdirilabilir
        // ama baska bir islem icin kullanmaya kalkisirsaniz NullPointerException verir

        // 7 - ClassCastException
        //     aralarinda parent child iliskisi olmayan class'lari
        //     object'i araci yaparak atamaya calisirsaniz

        String  s = "Ali";

        // Integer k = s; // Required type: Integer    Provided:String

        Object obj = s;  // Object parent class oldugundan kabul eder

        // Integer k = (Integer) obj;  // Farkli data turundeki non-primitive'ler birbirine atanamaz
                                    // (Parent - child class'lar arasinda atama yapilabilir)


        //  8 - NumberFormatException : Uygun olmayan bir String'i parse etmeye calisirsaniz

        String sayiS1 = "2a";
        String sayiS2 = "67";

        // String olarak verilen 2 sayiyi toplayin

        // System.out.println( Integer.parseInt(sayiS1) + Integer.parseInt(sayiS2) ); // 90


        // 9 - RunTimeException
        //     RunTime'da ortaya cikan tum exception'larin parent'idir


        // 10 - Exception : Tum exception class'larinin parent'idir

    }
}
