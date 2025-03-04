package day17_methodOlusturmVeKullanma;

public class C01_KendiSubstringKodlarimiz {

    public static void main(String[] args) {

        String metin = "Java Candir";

        int basIndex = 3;
        int bitIndex = 9;

        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */

        if (basIndex<0 || bitIndex<0 || basIndex>=metin.length() || bitIndex>= metin.length()){
            System.out.println("Girilen index gecersiz, metnin length'i " + metin.length());
        } else if (basIndex > bitIndex) {
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else {

            for (int i = basIndex; i <bitIndex ; i++) {

                System.out.print(metin.charAt(i));
            }

        }
        System.out.println();


        // Yukarda yazdigimiz bu kodlar mi daha kolay?
        // yoksa java'nin String class'ina koydugu substring method'unu kullanmak mi daha kolay

        System.out.println(  metin.substring(basIndex,bitIndex) );


        metin.contains("a");
        // 44.satirda contains() calisir ve
        // method bize boolean bir sonuc uretir
        // method'un urettigi bu boolean sonucu konsolda gormek ZORUNDA DEGILIZ
        // bizden istenen gorevin durumuna gore
        // method sonucunu yazdirabilir veya baskla bir variable'a atama yapabiliriz

        metin.contains("k");
        // 51.satir bize "false" sonucunu getirir
        // bu sonuc yazdirilmadigi icin konsolda goremeyiz
        // kaydedilmedigi icin de 51.satirdan sonra bu degeri kullanamayiz
        // kapici ekmegi alip geldi ama biz kapicidan ekmegi almadik

        System.out.println(metin.contains("Java"));
        // 57.satirdaki contains() bize "true" sonucunu getirir
        // sout da getirilen bu degeri yazdirir
        // biz de konsolda true goruruz
        // ancak sonuc bir variable'a atanmadigindan
        // 57.satirdan sonra bu sonucu kullanamayiz
        // ekmegi kapicidan aldik ve yedik, aksam yemegine ekmek YOK

        boolean sonuc = metin.contains(" ");
        // 65.satirdaki contains() bize "true" sonucunu getirir
        // = isareti de bu degeri sonuc variable'na atama yapar
        // sout icinde olmadigindan sonucu konsolda goremeyiz
        // istersek sonuc variable'ni yazdirarak konsolda da sonucu gorebiliriz
        // 65.satirdan sonra lazim olursa sonuc variable'inin degerini kullanabilirsiniz
        // kapici ekmegi alip geldi, bizde kapicidan ekmegi alip ekmek kabina koyduk
        // artik istedigim zaman yiyebilirim veya sonrasinda yemek uzere muhafaza edebilirim

    }
}
