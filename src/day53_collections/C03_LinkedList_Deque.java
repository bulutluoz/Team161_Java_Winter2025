package day53_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList_Deque {

    public static void main(String[] args) {

        Deque<Integer> sayilar = new LinkedList<>();

        // Deque : Double ended queue demektir
        // double ended oldugu icin tum method'larin basa ve sona gore versiyonlari vardir

        sayilar.add(12);
        sayilar.add(20); // basa veya sona oldugunu belirtmeyince, kendisi sona ekler

        System.out.println(sayilar); // [12, 20]

        sayilar.addFirst(11);
        sayilar.addLast(45);

        System.out.println(sayilar); // [11, 12, 20, 45]


        sayilar.removeFirst(); // deque'in en basindaki elemani(kac olduguna bakmaksizin) siler

        sayilar.removeFirstOccurrence(20); // 20'nin ilk kullanimini sil

        System.out.println(sayilar); // [12, 45]


        sayilar.offer(40);
        sayilar.offerFirst(45);
        sayilar.offerLast(30);

        System.out.println(sayilar); // [45, 12, 45, 40, 30]


        sayilar.pop();
        // removes and returns the first element of this deque.
        // This method is equivalent to removeFirst().
        System.out.println(sayilar); // [12, 45, 40, 30]

        System.out.println(sayilar.size());  // 4


        System.out.println(  sayilar.peekFirst()  );  // 12
        // method'un getirdigi delili yazdirir

        System.out.println(  sayilar  );
        // method calistiktan sonraki satirda deque'i yazdirirsaniz
        // method calistiktamn sonra listenin son halini yazdirir

    }
}
