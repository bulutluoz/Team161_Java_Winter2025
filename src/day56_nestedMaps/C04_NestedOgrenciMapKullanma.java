package day56_nestedMaps;

public class C04_NestedOgrenciMapKullanma extends NestedMapDepo{

    public static void main(String[] args) {

        System.out.println(ogrenciNestedMap);

        /*
                {
                    101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
                    102={sinif=1o, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
                    103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
                    104={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse},
                    105={sinif=11, sube=M, soyisim=Cem, bolum=TM, isim=Sevgi},
                    106={sinif=10, sube=K, soyisim=Can, bolum=MF, isim=Sevgi},
                    107={sinif=11, sube=M, soyisim=Han, bolum=SOZ, isim=Esra}
                    }

         */

        mapeOgrenciEkle(110,"Serpil","Yan","12","T","TM");

        System.out.println(ogrenciNestedMap);

        /*
                {
                    101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
                    102={sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
                    103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
                    104={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse},
                    105={sinif=11, sube=M, soyisim=Cem, bolum=TM, isim=Sevgi},
                    106={sinif=10, sube=K, soyisim=Can, bolum=MF, isim=Sevgi},
                    107={sinif=11, sube=M, soyisim=Han, bolum=SOZ, isim=Esra},
                    110={sinif=12, sube=T, soyisim=Yan, bolum=TM, isim=Serpil}
                    }

         */

        // listedeki 103 numarali ogrencinin ismini yazdirin
        System.out.println(ogrenciNestedMap.get(103).get("isim")); // Ali

        // listedeki 105 numarali ogrencinin sinifini 12, subesini T yapin

        ogrenciNestedMap.get(105)
                        .replace("sinif","12");
        ogrenciNestedMap.get(105).replace("sube","T");

        System.out.println(ogrenciNestedMap);


        // ogrenci map'inde 106 numarali ogrenci var mi ?

        System.out.println(ogrenciNestedMap.containsKey(106)); // true


        // ogrenci map'inde isim degeri Sevgi olan ogrenci var mi ?
        System.out.println(ogrenciNestedMap.containsValue("Sevgi")); // false
        // containsValue() value'leri bir butun olarak dusunur ve
        // value'su "Sevgi"'ye esit olan var mi diye kontrol eder


        // isimleri kontrol etmek icin mecburen tum elemanlari gozden gecirmeliyiz

        String sevgiVarMi = "yok";

        for ( Integer  eachKey:  ogrenciNestedMap.keySet()){

            if (ogrenciNestedMap.get(eachKey).get("isim").equalsIgnoreCase("sevgi")){
                sevgiVarMi = "var";
                break;
            }


        }

        System.out.println("Map'de sevgi isminde ogrenci var mi : " + sevgiVarMi);


        // soyismi can olan ogrencilerin
        // no, isim, sinif ve subelerini yazdirin

        // yine butun ogrencileri gozden gecirmemiz gerekiyor

        for (Integer eachKey:ogrenciNestedMap.keySet()){

            if (ogrenciNestedMap.get(eachKey).get("soyisim").equalsIgnoreCase("can")){
                System.out.println(
                        eachKey + " " +
                        ogrenciNestedMap.get(eachKey).get("isim") + " " +
                        ogrenciNestedMap.get(eachKey).get("sinif") + " " +
                        ogrenciNestedMap.get(eachKey).get("sube")
                );
            }

        }
    }
}
