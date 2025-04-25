package day52_iterator_listIterator;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C05_LinkedListOlusturma {

    public static void main(String[] args) {


        // LinkedList 3 tane Interface'i implement etmistir
        // 4 obje de LinkedList<>() kullandigi icin
        // LinkedList class'inin objeleridir
        // AMMMMMAAAA data turu farkli secildiginden
        // bu objelerin sahip olacagi method'lar da farkli farkli olabilir


        LinkedList<String> ll1 = new LinkedList<>();
        // implement ettigi List, Queue ve Deque'deki tum method'lara sahip

        List<String> ll2 = new LinkedList<>();
        // data turu List oldugundan bugune kadar arrayList'ler icin kullandigimiz
        // method'larla ayni method'lara sahip

        Deque<String> ll3 = new LinkedList<>();
        // ....... bir cok bilmedigimiz method'a sahip

        Queue<String> ll4 = new LinkedList<>();
        // offer, peek, poll







    }
}
