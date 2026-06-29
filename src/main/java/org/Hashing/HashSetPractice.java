package org.Hashing;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        hs.add(9);
        hs.add(10);
//
//        Iterator<Integer> it = hs.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        //Deep copy using constructor

        HashSet<Integer> hs1 = new HashSet<>(hs);
        System.out.println("Original: " + hs);
        System.out.println("copy: " + hs1);

    }
}
