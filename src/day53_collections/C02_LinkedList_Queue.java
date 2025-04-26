package day53_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C02_LinkedList_Queue {

    public static void main(String[] args) {

        // Queue kuyruk demektir
        // adindan da anlasilacagi gibi yeni eklenenler sona eklenirken
        // cikarilacaklar bastan cikarilir


        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.add(10);
        sayilar.add(25);
        sayilar.add(12);
        sayilar.add(10);
        sayilar.add(45);

        // elemanlar ekleme sirasina gore siralanir
        System.out.println(sayilar); // [10, 25, 12, 10, 45]

        // Queue yapisindan dolayi araya eleman eklenmez
        sayilar.add(87);
        System.out.println(sayilar); // [10, 25, 12, 10, 45, 87]


        // Queue'dan eleman silelim
        // eklemeler sona, silmeler bastan
        sayilar.remove();

        System.out.println(sayilar); // [25, 12, 10, 45, 87]


        sayilar.offer(67);
        // eger queue'da bir kapasite sinirlamasi yoksa queue'ya ekler
        // kapasite sinirlamasi varsa, kapasiteyi kontrol edip, uygunsa ekler

        System.out.println(sayilar); // [25, 12, 10, 45, 87, 67]


        System.out.println(sayilar.peek()); // 25
        // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        // eger queue bos ise null dondurur,
        // queue bos degilse en bastaki elemani silmeden bize dondurur

        System.out.println(sayilar); // [25, 12, 10, 45, 87, 67]


        System.out.println(sayilar.remove()); // 25
        // Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
        // eger queue bos ise exception firlatir,
        // queue bos degilse en bastaki elemani siler ve  bize dondurur

        System.out.println(sayilar); // [12, 10, 45, 87, 67]


        sayilar.poll();
        // Retrieves and removes the head of this queue, or returns null if this queue is empty.
        // eger queue bos ise null dondurur,
        // queue bos degilse en bastaki elemani siler ve  bize dondurur

        System.out.println(sayilar); // [10, 45, 87, 67]



    }
}
