package day27_multiDimensionalArrays;

public class C04_EnUzunKelimeyiYazdirma {

    public static void main(String[] args) {

        // Verilen iki katli String bir array'deki
        // en uzun kelimeyi yazdirin

        String[][] arr = { {"Ali","okula","git"},{"Merhabalar","arkadaslar"},{"Bu","is","olacak"}};

        String enUzunKelime = arr[0][0];

        for (int i = 0; i < arr.length ; i++) { // outer array
            for (int j = 0; j <arr[i].length ; j++) { // inner array'leri

                if (arr[i][j].length() > enUzunKelime.length()){
                    enUzunKelime = arr[i][j];
                }

            }
        }


        System.out.println("Array'deki en uzun kelime : " + enUzunKelime);

    }
}
