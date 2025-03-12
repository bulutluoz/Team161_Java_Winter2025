package day23_scope;

public class C04_HastaneRunner {


    public static void main(String[] args) {


        C03_Hastane pers1 = new C03_Hastane();

        System.out.println(pers1.persIsmi); // isim atanmadi
        System.out.println(pers1.perAdres); // adres atanmadi
        System.out.println(pers1.hastaneIsmi); // Yildiz
        System.out.println(pers1.bashekim); // Dr Eda


        pers1.persIsmi = "Fulya";
        pers1.perAdres = "Fulya / istanbul";
        pers1.perTel = "5321232334";


        C03_Hastane pers2 = new C03_Hastane();

        pers2.persIsmi = "Sevda";
        pers2.perAdres = "Besiktas";
        pers2.perTel = "5454565667";
        pers2.bashekim = "Dr Merve";
        pers2.hastaneAdresi="Istanbul";


        System.out.println(pers1.hastaneAdresi); // Istanbul
        System.out.println(pers1.persIsmi); // Fulya
        System.out.println(pers1.bashekim); // Dr Merve
        System.out.println(pers1.perAdres); // Fulya



    }
}
