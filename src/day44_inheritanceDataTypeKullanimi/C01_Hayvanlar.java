package day44_inheritanceDataTypeKullanimi;

public class C01_Hayvanlar {

    /*
        kartal hem hayvanlar class'inda,
               hem kuslar class'inda
               hem de avci kuslar class'inda var

        PEKIII hayvanlar class'indaki kartal ile
        kuslar class'indaki kartal ve avci kuslar class'indaki kartal
        ayni ozellikleri mi tasir?

        bu konuda iki farkli gorus var

        1- her obje class'indaki diger objelerle ORTAK OZELLIKLER tasimalidir
           orn.. kartal da BUTUN HAYVANLAR GIBI hareket eder

        2- her obje class'indaki diger objelerle ORTAK OZELLIKLER tasimalidir
           (hayvanlar class'indaki kartal icin gaga, kanat veya penceden bahsedemeyiz)
           AMMMMAAAA var olan ortak ozelliklerin
           mumkun ise en guncel halini alalim
           orn ... kartal da BUTUN HAYVANLAR GIBI hareket eder
                   hem de bu hareketi daha guncel bilgi olarak UCAR seklinde soyleyebiliriz

                   kartal da BUTUN HAYVANLAR GIBI beslenir
                   hem de bu beslenmeyi daha guncel bilgi olarak ET YER seklinde soyleyebiliriz

         Java kullanicilarina
         objelerin 2 sekilde de davranabilmesi icin
         bir opsiyon sunmustur

         EGER ozelliklerin 1. maddedeki gibi davranmasini istiyorsaniz
              ozellikleri VARIABLE olarak olusturmalisiniz

         EGER ozelliklerin 2. maddedeki gibi davranmasini istiyorsaniz
              ozellikleri METHOD olarak olusturmalisiniz
     */

    public String hareket =  "hareket ederler";
    public String solunum = "nefes alirlar";
    public String beslenme =  "beslenirler";
    public String cogalma = "cogalirlar";
    public String omur =  "yasar ve olurler";

}
