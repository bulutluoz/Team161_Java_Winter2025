package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_IstenmeyenElemanlariSilme {

    public static void main(String[] args) {

        // Verilen String bir listede
        // istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun


        List<String> liste1 =
                new ArrayList<>(Arrays.asList("Merve","Cennet","Buse","Serpil","Eda","Servet"));

        // e iceren isimleri silin
        String silinecekHarf = "t";

        // listedeki tum isimleri tek tek ele alalim

        for (int i = 0; i < liste1.size() ; i++) {

            if (liste1.get(i).contains(silinecekHarf)){
                liste1.remove(liste1.get(i));
                // uzerinde calisilan listede bir silme yaptiginizda
                // index'ler kaymis oluyor
                // bunu cozmek icin
                // silme yapinca i'yi bir azaltabiliriz
                i--;
            }

        }

        System.out.println(liste1);

    }


}
