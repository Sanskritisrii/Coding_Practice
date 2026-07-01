package org.example;
import java.util.*;

import org.Queue.EnqueueAndDequeue;

import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String firstname = sc.nextLine();
//        String lastname = sc.next();
//        System.out.println("Enter age");
//        int age = sc.nextInt();
//        System.out.println("Enter grade ");
//        char grade = sc.next().charAt(0);
//
//        System.out.println("My firstname is " + firstname + " and lastname is " + lastname);
//        System.out.println("My age is " + age);
//        System.out.println("My grade is " + grade);
//        System.out.println(Month.JANUARY);
//        ArithmeticExpression ae = new ArithmeticExpression();
//        int additionresult = ae.addition(4,7);
//        System.out.println(additionresult);
//
//        RelationOperators r = new RelationOperators();
//        r.compareGrade();
//
//        LogicalOperators l = new LogicalOperators();
//        l.shouldGoForPicnic();

//        AssignementOperators as = new AssignementOperators();
//        int result = as.summation(4);
//        System.out.println(result);
//
//        result = as.summation(7);
//        System.out.println(result);

        //Problem5
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//
//        System.out.println("Driving licence? : ");
//        boolean licence = sc.nextBoolean();
//
//        Problem5 dr = new Problem5();
//        dr.CheckEligibility(age,licence);

        //Problem6
//        System.out.println("Enter the category : ");
//        int c = sc.nextInt();
//        System.out.println("Enter the price : ");
//        int p = sc.nextInt();
//        System.out.println("Discount ? :");
//        boolean d = sc.nextBoolean();
//
//        Problem6 cp = new Problem6();
//        cp.calculatePrice(c,p,d);

        //Problem7

//        System.out.println("Enter your marks : ");
//        int marks = sc.nextInt();
//
//        Problem7 cg = new Problem7();
//        cg.chechGrade(marks);

        //Problem8
//        Problem8 rn = new Problem8();
//        rn.reverseNumber(1234,0);

        //Problem9

//        Problem9 ly = new Problem9();
//        ly.leapYear(2004);

//        Calculator m = new Calculator();
//        System.out.println("Enter num1 : ");
//        int num1 = sc.nextInt();
//
//        boolean exit = false;
//
//        do {
//
//            System.out.println("press 1 for addition: ");
//            System.out.println("press 2 for subtraction: ");
//            System.out.println("press 3 for multiplication: ");
//            System.out.println("press 4 for division: ");
//
//            int inputNumber = sc.nextInt();
//
//            System.out.println("Current num1 : "+ num1);
//
//            System.out.println("Enter num2 : ");
//            int num2 = sc.nextInt();
//            try {
//                switch (inputNumber) {
//                    case 1: {
//                        num1 = m.addition(num1, num2);
//                        System.out.println("Addition: " + num1);
//                        break;
//                    }
//                    case 2: {
//                        num1 = m.subtraction(num1, num2);
//                        System.out.println("Subtraction: " + num1);
//                        break;
//
//                    }
//                    case 3: {
//                        num1 = m.multiplication(num1, num2);
//                        System.out.println("Multiplication: " + num1);
//                        break;
//                    }
//                    case 4: {
//                        num1 = m.division(num1, num2);
//                        System.out.println("Division: " + num1);
//                        break;
//                    }
//                }
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println("We get an exception while divide by 0 ");
//                System.out.println(m.division(num2 , num1));
//            }
//                System.out.println("Press 1 if you want to exit or press any number to continue : ");
//                int exitNumber = sc.nextInt();
//                if (exitNumber == 1)
//                    exit = true;
//
//        } while (exit != true) ;

        //greater

//        Greater greater = new Greater();
//        greater.printNumber(2,7,6);

        //product

//        Product p = new Product();
//        int result = p.product(2,5);
//        double r = p.product(2.4,5.7);
//        System.out.println(r);

        //processOrder
//        OrderProcessor orderProcessor = new OrderProcessor();
//        orderProcessor.processOrder(2,"computer");

        //BankingSystem
//        BankingSystem bankingSystem = new BankingSystem(101,"Sanskriti");
//        bankingSystem.deposit(4000);
//        bankingSystem.withdraw(2000);
//        bankingSystem.getAccountInfo();
//        System.out.println();

        //calculator
//        Calculator calculator = new Calculator();
//        int result1 = calculator.addition(3,5);
//        System.out.println("result : " + result1);
//        System.out.println();

        //calculateArea
//        Shape circle = new Circle(3);
//        Shape rectangle = new Rectangle(4,6);
//        System.out.println("Area of circle : " + circle.calculateArea());
//        System.out.println("Area of Rectangle " + rectangle.calculateArea());

        //Sum of all the 2D array elements
//        int[][] arr1 = {{1,2},{3,4},{5,6},{7,8},{9,10}};
//        Sum2DArray sum2DArray = new Sum2DArray();
//        int resultArr = sum2DArray.sum(arr1);
//        System.out.println("Sum of Array elemnts : " + resultArr);

        //Searching value
//        String[][] arr1 = {{"happy","apple"},{"sad","mango"},{"play","orange"},{"dance","grapes"}};
//        Searchvalue searchvalue = new Searchvalue();
//        System.out.println(searchvalue.search(arr1,"dance"));


                   //LinkedList
//        SinglyLinkedList list = new SinglyLinkedList();
//
//        // insert front
//        list.insertFront(10);
//        list.insertFront(5);
//
//        // insert end
//        list.insertEnd(20);
//        list.insertEnd(30);
//
//        System.out.println("front and end insertion:");
//        list.display();
//
//        // insert middle
//        list.insertMiddle(3, 15);
//
//        System.out.println("after middle insertion:");
//        list.display();
//
//        // delete front
//        list.deleteFront();
//
//        System.out.println("after delete front :");
//        list.display();
//
//        // delete end
//        list.deleteEnd();
//        System.out.println("after delete end: ");
//        list.display();
//
//        // deelete middle
//        list.deleteMiddle(2);
//
//        System.out.println("after delete middle: ");
//        list.display();
         //Queue

//        EnqueueAndDequeue q = new EnqueueAndDequeue(5);
//
//        q.enqueue(10);
//        q.enqueue(20);
//        q.enqueue(30);
//
//        q.display();
//
//        q.dequeue();
//
//        q.display();
//
//        q.enqueue(40);
//
//        q.display();

//        Hashtable<String,Integer> ht = new Hashtable<>();
//        Hashtable<String,Integer>ht1= new Hashtable<>();
//        ht.put("Khushi",1);
//        ht.put("Raj",2);
//        ht.put("Kumar",3);
//        ht1.put("Khushi1",1);
//        ht1.put("Raj2",2);
//        ht1.put("Kumar3",3);
//
//        System.out.println(ht);
//        System.out.println(ht.values());
//        System.out.println(ht.keySet());
//        System.out.println(ht.containsKey("Raj"));
//        System.out.println(ht.get("Khushi"));
//        System.out.println(ht.isEmpty());
//        System.out.println(ht.entrySet());
//
//        Object hm = ht.clone();

//
//        int arr[] = {2,7,11,15,3};
//        int target = 5;
//
//        Hashtable<Integer,Integer> ht = new Hashtable<>();
//
//        for (int num : arr) {
//
//            int result = target-num;
//            if (ht.containsKey(result)) {
//                System.out.println("Pair is: " +result + " " + num);
//                return;
//            }
//
//            ht.put(num, 1);
//
//        }
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};

        int findNumber = 2;

        int arrSize = arr.length - 1;

        for (int i = 0; i <= arrSize; ) {

            int mid = (i + arrSize) / 2;

            if (arr[mid] == findNumber) {
                System.out.println("Found at index " + mid);
                break;
            }

            if (findNumber > arr[mid]) {
                i = mid + 1;
            } else {
                arrSize = mid - 1;
            }
        }












    }
}