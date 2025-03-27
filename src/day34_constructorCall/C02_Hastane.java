package day34_constructorCall;

public class C02_Hastane {
    /*
        Local variable'lar static olarak TANIMLANAMAZ

        static keyword class level'da kullanilabilir

        class level variable'larin static veya instance olmasina
        objelerin bu variable'i kullanmasina gore karar veririz
        - tum variable'lar icin ortak TEK BIR deger alan variable varsa "static" ,
        - her bir obje icin birbirinden farkli, bagimsiz bir deger almasi gereken varsa "instance" tanimlanir

        500 personeli olan hastane de
        static olarak tanimlanan bashekimIsmi variable'i sadece 1 tane olusturulur,
        ve tum objelerin  bashekimIsmi degeri AYNI OLUR


        instance olarak tanimlanan perIsmi variable'i
        Java tarafindan 500 kere kopyalanip
        tum personele atamalar yapilir

        instance variable mi daha iyidir?
        yoksa static variable mi ?

        - erisim acisindan static variable daha avantajlidir
        - variable'larin deger kontolu yapilmasi acisindan ise instance daha kullanislidir.
     */





    public static void main(String[] args) {

        // static int sayi1 = 45;
        // Modifier 'static' not allowed here

    }

    public static void method1(){
        // static String isim = "";
    }


    public void method2(){
        // static char chr = 'a';
    }





}
