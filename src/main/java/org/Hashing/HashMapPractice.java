package org.Hashing;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args){
        HashMap<String, Integer> emp = new HashMap<>();

        emp.put("Khushi",20000);
        emp.put("raj", 30000);
        emp.put("Rahul",230000);
        emp.put("Sankriti", 450000);
        emp.put("Ram" , 34000);
        emp.put("Kajal" , 230000);
        emp.put("Shalini",10000);
        emp.put("Karan",34000);
        emp.put("Mauli", 200000);
        emp.put("Richa", 340000);

//        for(Map.Entry<String,Integer> hm : emp.entrySet()){
//            System.out.println("Name: " + hm.getKey() + " ,  " + "Salary : " + hm.getValue());
//        }

        //deep copy

        HashMap<String , Integer> emp1 = new HashMap<>(emp);
        System.out.println("Original map: ");
        System.out.println(emp.entrySet());

        System.out.println("copy: ");
        System.out.println(emp1.entrySet());




    }
}
