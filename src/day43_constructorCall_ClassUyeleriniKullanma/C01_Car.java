package day43_constructorCall_ClassUyeleriniKullanma;

public class C01_Car {

    /*
        - bir child class'da olusturulan objeler
          parent class(lar)'daki tum ozelliklere de sahip olur.

        - bir obje olusturulurken
          ilk deger atamasini (instance variable'larin bir kopyasini alip objeye yapistirma)
          Constructor yapar

        - Yukardaki iki maddeyi birlestirirsek
          child class'da olusturulan bir objenin
          parent class'daki ozelliklere sahip olmasi icin
          parent class constructor'inin calismasi gerekir

        - Java inheritance kullanan ( extends ile bir class'i parent edinen)
          class'lardaki her constructor'in ilk satirinda
          parent class constructor'ini calistiracak
          super() constructor call yerlestirmistir.

        - bir constructor'da birden fazla constructor call olamayacagi icin
          eger kodu yazan kisi ilk satira bir constructor call yazarsa
          java kendi koydugu super()'u siler

     */

    C01_Car(){
        System.out.println("Car constructor calisti");
    }

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public String motor = "Motor secenegi belirtilmedi";
    public String sanzuman = "Sanzuman secilmedi";
    public String kasa = "Kasa secilmedi";
}
