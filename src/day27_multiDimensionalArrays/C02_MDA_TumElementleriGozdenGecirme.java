package day27_multiDimensionalArrays;

public class C02_MDA_TumElementleriGozdenGecirme {

    public static void main(String[] args) {



        int[] numbers = {3,7,8,1};
        // numbers arrray'indeki tum elementlerin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < numbers.length; i++) {
            toplam += numbers[i];
        }

        System.out.println("numbers'daki elemanlarin toplami : " + toplam); // 19



        int[][] sayilar = {{3,5,4},{2,3,6,8},{2,4},{10},{3,9,0,2,7}};
        // sayilar arrray'indeki tum elementlerin toplamini yazdirin
        // sayilar 2 katli bir array oldugundan
        // elemanlara ulasmak icin sayilar[1][2] gibi 2 index'e ihtiyacimiz var
        toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) { // outer for loop, outer array'i kontrol eder
                                                    // sayilar[i][]
            for (int j = 0; j < sayilar[i].length ; j++) { // inner for loop, inner array'leri kontrol eder
                                                            // sayilar[i][j]

                toplam += sayilar[i][j];

            }

        }

        System.out.println("sayilar'daki elemanlarin toplami : " + toplam); // 68

    }
}
